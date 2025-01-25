package Hangman;

public class WordToGuess {
    String word;
    Category category;
    int point;
    DifficultyLevel difficultyLevel;


    public WordToGuess(String word, Category category, int point, DifficultyLevel difficultyLevel) {
        this.word = word;
        this.category = category;
        this.point = point;
        this.difficultyLevel = difficultyLevel;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public String toString() {
        return "WordToGuess{" +
                "word='" + word + '\'' +
                ", category=" + category +
                ", point=" + point +
                ", difficultyLevel=" + difficultyLevel +
                '}';
    }
}
