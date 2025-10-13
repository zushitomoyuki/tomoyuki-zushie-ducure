import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Word {
    final String english;
    final String japanese;

    public Word(String english, String japanese) {
        this.english = english;
        this.japanese = japanese;
    }
}

public class EnglishWordQuizAppSimplest {
    private static final int MAX_WORDS = 20;
    private static final List<Word> wordList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startProgram();
    }

    private static void startProgram() {
        int choice = 0;
        while (choice != 3) {
            System.out.println("\n=== メインメニュー ===");
            System.out.println("1. 単語登録 (現在: " + wordList.size() + "/" + MAX_WORDS + ")");
            System.out.println("2. クイズ実施");
            System.out.println("3. 終了");
            System.out.print("メニューを選択してください (1-3): ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                    case 1: registerWord(); break;
                    case 2: startQuiz(); break;
                    case 3: System.out.println("プログラムを終了します。さようなら！👋"); break;
                    default: System.out.println("⚠️ 無効な選択です。1から3の数字を入力してください。");
                }
            } else {
                System.out.println("⚠️ 無効な入力です。数字を入力してください。");
                scanner.nextLine(); 
            }
            System.out.println("----------------------------------------");
        }
    }

    private static void registerWord() {
        System.out.println("\n=== 単語登録 ===");

        if (wordList.size() >= MAX_WORDS) {
            System.out.println("❌ エラー: 最大" + MAX_WORDS + "個までです。");
            return;
        }

        String english, japanese;

        while (true) {
            System.out.print("英単語を入力してください: ");
            english = scanner.nextLine().trim();
            if (english.isEmpty()) {
                System.out.println("⚠️ 必須入力です。");
            } else {
                break;
            }
        }
        
        while (true) {
            System.out.print("日本語訳を入力してください: ");
            japanese = scanner.nextLine().trim();
            if (japanese.isEmpty()) {
                System.out.println("⚠️ 必須入力です。");
            } else {
                break;
            }
        }

        wordList.add(new Word(english, japanese));
        System.out.println("✅ 単語: '" + english + "' を登録しました。");
    }

    private static void startQuiz() {
        if (wordList.isEmpty()) {
            System.out.println("❌ エラー: 単語が登録されていません。");
            return;
        }

        Collections.shuffle(wordList); 
        int correctCount = 0;
        int totalQuestions = wordList.size(); 

        System.out.println("\n=== クイズ開始！全" + totalQuestions + "問 ===\n");

        for (int i = 0; i < totalQuestions; i++) {
            Word currentWord = wordList.get(i);
            
            System.out.println("--- 第" + (i + 1) + "問 ---");
            System.out.println("日本語: " + currentWord.japanese);
            System.out.print("あなたの解答 (英単語): ");
            
            String userAnswer = scanner.nextLine().trim();
            
            if (userAnswer.equalsIgnoreCase(currentWord.english)) {
                System.out.println("⭕️ 正解！");
                correctCount++;
            } else {
                System.out.println("❌ 不正解... 正解は '" + currentWord.english + "' でした。");
            }
        }
        
       
        displayResults(correctCount, totalQuestions);
    }
    
    private static void displayResults(int correctCount, int totalQuestions) {
        System.out.println("\n=== 成績表示 ===");
        System.out.println("全問数: " + totalQuestions + "問");
        System.out.println("正解数: " + correctCount + "問");

        if (totalQuestions > 0) {
            double accuracy = ((double) correctCount / totalQuestions) * 100;
            System.out.printf("正答率: %.1f%%\n", accuracy);
        }
    }
}