public class AppController {
    private AppView _appView;
    private Board _board;
    private MagicSquare _magicSquare;

    public AppController() {
        this._appView = new AppView();
        this._board = null;
        this._magicSquare = new MagicSquare();
    }

    public void run() {
        this._appView.outputMessage("<<< 마방진 풀이를 시작합니다 >>>");
        OrderValidity currentOrderValidity;

        int order = this._appView.inputOrder();
        while(order > 0) {
            currentOrderValidity = this._magicSquare.checkOrderValidity(order);
            if(currentOrderValidity == OrderValidity.Valid) {
                this._appView.outputTitleWithOrder(order);
                this._board = this._magicSquare.solve(order);
                this.showBoard();
            } else {
                this.showOrderValidityErrorMessage(currentOrderValidity);
            }
            order = this._appView.inputOrder();
        }
        this._appView.outputMessage("<<< 마방진 풀이를 종료합니다 >>>");
    }

    private void showOrderValidityErrorMessage(OrderValidity anOrderValidity) {
        switch (anOrderValidity) {
            case TooSmall:
                this._appView.outputMessage("오류: 차수가 너무 작습니다. 3보다 크거나 같아야 합니다.");
                break;
            case TooLarge:
                this._appView.outputMessage("오류: 차수가 너무 큽니다. 99보다 작거나 같아야 합니다.");
                break;
            case NotOddNumber:
                this._appView.outputMessage("오류: 차수가 짝수입니다. 홀수이어야 합니다.");
                break;
            default:
                break;
        }
    }

    private void showBoard() {
        CellLocation cellLoc;

        this._appView.outputMessage("");

        for(int row = 0; row<this._magicSquare.order(); row++) {
            System.out.format("[ %2d ] ", row);
            for(int col = 0; col<this._magicSquare.order(); col++) {
                cellLoc = new CellLocation(row, col);
                System.out.format("%6d", this._board.cell(cellLoc));

            }
            this._appView.outputMessage("");
        }
    }

}
