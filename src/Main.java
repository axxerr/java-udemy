public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 50;
        int levelComplated = 3;
        int bonus = 10;

        int pos=CalculateHighScore(50);
        displayHighSorePosition("norbi",pos);
    }

                public static int CalculateScore(boolean gameOver, int score, int levelComplated, int bonus) {
                    if (gameOver) {
                        int finalScore = score + (levelComplated * bonus) + 100;
                        return finalScore;
                    }
                    return -1;
                }

                    public static void displayHighSorePosition(String name, int pos) {
                        System.out.println("your posiciion is  " + name+" is "+pos);

                    }

                    public static int CalculateHighScore(int pos) {
                        int score = pos;

                        if (score > 1000) return 1;
                        else if (score > 500 && score < 1000) {
                            return 2;
                        } else if (score > 100 && score < 500) {
                            return 3;
                        } else {
                            return 4;
                        }
    }

}

