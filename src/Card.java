public class Card {
    private CardSquare[][] grid = new CardSquare[4][13];
    public static int A = 4;
    public static int K = 4;
    public static int Q = 4;
    public static int J = 4;
    public static int TEN = 4;
    public static int NINE = 4;
    public static int EIGHT = 4;
    public static int SEVEN = 4;
    public static int SIX = 4;
    public static int FIVE = 4;
    public static int FOUR = 4;
    public static int THREE = 4;

    public Card() {
        createMap();
    }

    public void createMap() {
        grid = new CardSquare[4][13];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = new CardSquare();
            }
        }

        for (int x = 0; x < A; ) {
            int r = (int) (Math.random() * 4);
            int c = (int) (Math.random() * 13);
            if (!grid[r][c].isA() && !grid[r][c].isK() && !grid[r][c].isQ()  && !grid[r][c].isK() && !grid[r][c].isTEN()  && !grid[r][c].isNINE() && !grid[r][c].isEIGHT()  && !grid[r][c].isSEVEN() && !grid[r][c].isSIX() && !grid[r][c].isFIVE() && !grid[r][c].isFOUR() && !grid[r][c].isTHREE() && !grid[r][c].isTWO()) {
                x++;
                grid[r][c].setA(false);
            }

        }
        for (int x = 0; x < K; ) {
            int r = (int) (Math.random() * 4);
            int c = (int) (Math.random() * 13);
            if (!grid[r][c].isA() && !grid[r][c].isK() && !grid[r][c].isQ()  && !grid[r][c].isK() && !grid[r][c].isTEN()  && !grid[r][c].isNINE() && !grid[r][c].isEIGHT()  && !grid[r][c].isSEVEN() && !grid[r][c].isSIX() && !grid[r][c].isFIVE() && !grid[r][c].isFOUR() && !grid[r][c].isTHREE() && !grid[r][c].isTWO()) {
                x++;
                grid[r][c].setK(false);
            }


        }


    }

    public CardSquare[][] getGrid() {
        return grid;
    }

    public void setGrid(CardSquare[][] grid) {
        this.grid = grid;
    }

    public CardSquare getSquare(int row, int col) {
        return grid[row][col];

    }
}