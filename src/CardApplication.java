import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Iterator;


public class CardApplication extends Application {
    Set masterSet = new Set();
    Set player1 = new Set();
    Set player2 = new Set();
    Image Cardback;
    Image J;
    Image K;
    Image Q;
    Image A;
    Image TEN;
    Image NINE;
    Image EIGHT;
    Image SEVEN;
    Image SIX;
    Image FIVE;
    Image FOUR;
    Image THREE;
    Image TWO;
    double x = 0;
    double y = 0;
    int r = -1;
    int c = -1;
    int r1 = -1;
    int c1 = -1;
    int x1;
    int y1;
    boolean playerTurn = true;
    boolean flipped = false;
    boolean turn = false;
    boolean PLAYERONE = false;
    boolean PLAYERTWO = false;
    boolean game = true;
    long flipTime = 0;
    private String[][] grid = new String[4][13];

    @Override
    public void start(Stage primaryStage) throws Exception {
        Cardback = new Image("File:Images/FINAL.png");
        J = new Image("File:Images/jack_of_clubs2.png");
        A = new Image("File:Images/ace_of_clubs.png");
        Q = new Image("File:Images/queen_of_clubs2.png");
        K = new Image("File:Images/king_of_clubs2.png");
        TEN = new Image("File:Images/10_of_clubs.png");
        NINE = new Image("File:Images/9_of_clubs.png");
        EIGHT = new Image("File:Images/8_of_clubs.png");
        SEVEN = new Image("File:Images/7_of_clubs.png");
        FIVE = new Image("File:Images/5_of_clubs.png");
        FOUR = new Image("File:Images/4_of_clubs.png");
        SIX = new Image("File:Images/6_of_clubs.png");
        THREE = new Image("File:Images/3_of_clubs.png");
        TWO = new Image("File:Images/2_of_clubs.png");
        Group group = new Group();
        Canvas canvas = new Canvas(800, 800);
        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                x = event.getX();
                y = event.getY();
                //x 290 505
                // 325 350 385 410 445 470
                // 4
                // 60 65 120 125 180 185
                if (event.getButton().name() == "PRIMARY") {
                    if ((x <= 325 && x >= 290)) {
                        if (y >= 5 && y <= 60) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 65 && y <= 120) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 125 && y <= 180) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 185 && y <= 240) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 245 && y <= 300) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 305 && y <= 360) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 365 && y <= 420) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 425 && y <= 480) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 485 && y <= 540) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 545 && y <= 600) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 605 && y <= 660) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 665 && y <= 720) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 725 && y <= 780) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else
                            return;
                    } else if ((x >= 350 && x <= 385)) {
                        if (y >= 5 && y <= 60) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 65 && y <= 120) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 125 && y <= 180) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 125 && y <= 180) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 185 && y <= 240) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 245 && y <= 300) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 305 && y <= 360) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 365 && y <= 420) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 425 && y <= 480) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 485 && y <= 540) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 545 && y <= 600) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 605 && y <= 660) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 665 && y <= 720) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 725 && y <= 780) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else
                            return;
                    } else if ((x >= 410 && x <= 445)) {
                        if (y >= 5 && y <= 60) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 65 && y <= 120) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 125 && y <= 180) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 125 && y <= 180) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 185 && y <= 240) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 245 && y <= 300) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 305 && y <= 360) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 365 && y <= 420) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 425 && y <= 480) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 485 && y <= 540) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 545 && y <= 600) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 605 && y <= 660) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 665 && y <= 720) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 725 && y <= 780) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else
                            return;
                    } else if ((x >= 470 && x <= 505)) {
                        if (y >= 5 && y <= 60) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 65 && y <= 120) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 125 && y <= 180) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 125 && y <= 180) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 185 && y <= 240) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 245 && y <= 300) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 305 && y <= 360) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 365 && y <= 420) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 425 && y <= 480) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 485 && y <= 540) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 545 && y <= 600) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 605 && y <= 660) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 665 && y <= 720) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else if (y >= 725 && y <= 780) {
                            x1 = (int) ((((x / 35) * 60) - 480)) / 100;
                            y1 = (int) ((((y / 36) * 60) - 5)) / 100;
                        } else
                            return;
                    } else {
                        return;
                    }
                    if (game) {
                        if (x1 > -1 && x1 < 4 && y1 < 13) {
                            if (r == -1) {
                                if (grid[x1][y1] != null) {
                                    r = x1;
                                    c = y1;
                                    turn = true;
                                } else
                                    return;

                            } else if (r1 == -1) {
                                if (r == x1 && c == y1) {
                                    r1 = -1;
                                    c1 = -1;
                                    return;
                                } else {
                                    if (grid[x1][y1] != null) {
                                        r1 = x1;
                                        c1 = y1;
                                        flipTime = System.nanoTime();
                                        flipped = true;
                                    } else
                                        return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } else if (event.getButton().name() == "SECONDARY") {
                    System.out.println("TEST");
                    if (PLAYERONE == true || PLAYERTWO == true) {
                        reset();
                    }
                }
                Paint(canvas.getGraphicsContext2D());
            }
        });
        group.getChildren().add(canvas);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Adeeb Ismail");
        primaryStage.show();
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (flipped && (now - flipTime) / 1000000000 > 1)
                {
                    if (grid[r][c] == grid[r1][c1]) {
                        if (playerTurn == true) {
                            if (player2.contains(grid[r][c])) {
                                if (playerTurn == true) {
                                    playerTurn = false;
                                } else
                                    playerTurn = true;
                            } else {
                                player2.add(grid[r][c]);
                                grid[r][c] = null;
                                grid[r1][c1] = null;
                                playerTurn = false;
                            }
                        } else if (playerTurn == false) {
                            if (player1.contains(grid[r][c])) {
                                if (playerTurn == true) {
                                    playerTurn = false;
                                } else
                                    playerTurn = true;
                            } else {
                                player1.add(grid[r][c]);
                                grid[r][c] = null;
                                grid[r1][c1] = null;
                                playerTurn = true;
                            }
                        }
                    } else {
                        if (playerTurn == true) {
                            playerTurn = false;
                        } else
                            playerTurn = true;
                    }
                    turn = false;
                    flipped = false;
                    r = -1;
                    c = -1;
                    r1 = -1;
                    c1 = -1;
                }
                Paint(canvas.getGraphicsContext2D());
            }
        }.start();
        canvas.requestFocus();
        masterSet.add("A");
        masterSet.add("K");
        masterSet.add("Q");
        masterSet.add("J");
        masterSet.add("10");
        masterSet.add("9");
        masterSet.add("8");
        masterSet.add("7");
        masterSet.add("6");
        masterSet.add("5");
        masterSet.add("4");
        masterSet.add("3");
        masterSet.add("2");
        for (int i = 0; i < 4; i++) {
            Iterator<String> ad = masterSet.iterator();
            while (ad.hasNext()) {
                String v = ad.next();
                int r5 = (int) (Math.random() * 4);
                int c5 = (int) (Math.random() * 13);
                while (grid[r5][c5] != null) {
                    r5 = (int) (Math.random() * 4);
                    c5 = (int) (Math.random() * 13);
                }
                grid[r5][c5] = v;
            }
        }
        Paint(canvas.getGraphicsContext2D());
    }

    public void reset() {
        player1 = new Set();
        player2 = new Set();
        r = -1;
        c = -1;
        r1 = -1;
        c1 = -1;
        x1 = 0;
        y1 = 0;
        playerTurn = true;
        flipped = false;
        turn = false;
        PLAYERONE = false;
        PLAYERTWO = false;
        game = true;
        flipTime = 0;
        grid = new String[4][13];
        for (int i = 0; i < 4; i++) {
            Iterator<String> ad = masterSet.iterator();
            while (ad.hasNext()) {
                String v = ad.next();
                int r5 = (int) (Math.random() * 4);
                int c5 = (int) (Math.random() * 13);
                while (grid[r5][c5] != null) {
                    r5 = (int) (Math.random() * 4);
                    c5 = (int) (Math.random() * 13);
                }
                grid[r5][c5] = v;
            }
        }
    }


    private void Paint(GraphicsContext gc) {
        if (player1.size() == 13) {
            playerTurn = true;
            PLAYERONE = true;
            game = false;
        } else if (player2.size() == 13) {
            playerTurn = false;
            PLAYERTWO = true;
            game = false;
        }
        gc.setFill(Color.FORESTGREEN);
        gc.fillRect(0, 0, 800, 800);
        gc.setFill(Color.LIGHTSTEELBLUE);
        gc.fillRect(0, 0, 150, 800);
        gc.fillRect(650, 0, 150, 800);
        gc.setStroke(Color.BLACK);
        gc.strokeRect(25, 0, 100, 50);
        gc.strokeRect(675, 0, 100, 50);
        if (playerTurn == true) {
            gc.setFill(Color.FORESTGREEN);
            gc.fillRect(675, 0, 100, 50);
        } else {
            gc.setFill(Color.FORESTGREEN);
            gc.fillRect(25, 0, 100, 50);
        }
        for (int i = 1; i < 7; i++) {
            gc.strokeRect(10, i * 80, 40, 40);
            gc.strokeRect(100, i * 80, 40, 40);
            gc.strokeRect(660, i * 80, 40, 40);
            gc.strokeRect(750, i * 80, 40, 40);
        }
        gc.strokeRect(10, 560, 40, 40);
        gc.strokeRect(660, 560, 40, 40);
        Iterator<String> it = masterSet.iterator();
        int x = 10;
        int y = 80;
        int e = 0;
        while (it.hasNext()) {
            e++;
            String value = it.next();
            if (player1.contains(value)) {
                gc.setFill(Color.FORESTGREEN);
            } else {
                gc.setFill(Color.LIGHTSTEELBLUE);
            }
            if (e <= 7) {
                gc.fillRect(x, y * (e), 40, 40);
            } else {
                gc.fillRect(100, y * (e - 7), 40, 40);
            }
            if (player2.contains(value)) {
                gc.setFill(Color.FORESTGREEN);
            } else {
                gc.setFill(Color.LIGHTSTEELBLUE);
            }
            if (e <= 7) {
                gc.fillRect(660, y * (e), 40, 40);
            } else {
                gc.fillRect(750, y * (e - 7), 40, 40);
            }
        }
        for (int r7 = 0; r7 < 4; r7++) {
            for (int c7 = 0; c7 < 13; c7++) {
                if (grid[r7][c7] != null) {
                    gc.drawImage(Cardback, (r7 * 60) + 290, (c7 * 60) + 5, 35, 55);
                }
            }
        }
        for (int r3 = 0; r3 < 4; r3++) {
            for (int c3 = 0; c3 < 13; c3++) {
                if (turn == true) {
                    if (grid[r][c] == "A") {
                        gc.drawImage(A, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "J") {
                        gc.drawImage(J, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "10") {
                        gc.drawImage(TEN, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "9") {
                        gc.drawImage(NINE, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "8") {
                        gc.drawImage(EIGHT, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "7") {
                        gc.drawImage(SEVEN, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "6") {
                        gc.drawImage(SIX, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "5") {
                        gc.drawImage(FIVE, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "4") {
                        gc.drawImage(FOUR, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "3") {
                        gc.drawImage(THREE, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "2") {
                        gc.drawImage(TWO, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "K") {
                        gc.drawImage(K, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    } else if (grid[r][c] == "Q") {
                        gc.drawImage(Q, (r * 60) + 290, (c * 60) + 5, 35, 55);
                    }
                }
                if (flipped == true) {
                    if (grid[r1][c1] == "A") {
                        gc.drawImage(A, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "J") {
                        gc.drawImage(J, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "10") {
                        gc.drawImage(TEN, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "9") {
                        gc.drawImage(NINE, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "8") {
                        gc.drawImage(EIGHT, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "7") {
                        gc.drawImage(SEVEN, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "6") {
                        gc.drawImage(SIX, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "5") {
                        gc.drawImage(FIVE, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "4") {
                        gc.drawImage(FOUR, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "3") {
                        gc.drawImage(THREE, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "2") {
                        gc.drawImage(TWO, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "K") {
                        gc.drawImage(K, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    } else if (grid[r1][c1] == "Q") {
                        gc.drawImage(Q, (r1 * 60) + 290, (c1 * 60) + 5, 35, 55);
                    }
                }
            }
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font(30));
            gc.fillText("A", 20, 110);
            gc.fillText("K", 20, 190);
            gc.fillText("Q", 18, 270);
            gc.fillText("J", 25, 350);
            gc.fillText("10", 13, 430);
            gc.fillText("9", 22, 510);
            gc.fillText("8", 22, 590);
            gc.fillText("7", 112, 110);
            gc.fillText("6", 112, 190);
            gc.fillText("5", 112, 270);
            gc.fillText("4", 112, 350);
            gc.fillText("3", 112, 430);
            gc.fillText("2", 112, 510);
            gc.fillText("A", 670, 110);
            gc.fillText("K", 670, 190);
            gc.fillText("Q", 668, 270);
            gc.fillText("J", 675, 350);
            gc.fillText("10", 663, 430);
            gc.fillText("9", 672, 510);
            gc.fillText("8", 672, 590);
            gc.fillText("7", 762, 110);
            gc.fillText("6", 762, 190);
            gc.fillText("5", 762, 270);
            gc.fillText("4", 762, 350);
            gc.fillText("3", 762, 430);
            gc.fillText("2", 762, 510);
            gc.setFont(Font.font(20));
            gc.fillText("Player One", 28, 30);
            gc.fillText("Player Two", 678, 30);
            if (PLAYERTWO == true) {
                gc.setFill(Color.BLACK);
                gc.setFont(Font.font(30));
                gc.fillText("Player Two Won, Right click to reset", 230, 400);
            } else if (PLAYERONE == true) {
                gc.setFill(Color.BLACK);
                gc.setFont(Font.font(30));
                gc.fillText("Player One Won, Right click to reset", 230, 400);
            }
        }
    }
}