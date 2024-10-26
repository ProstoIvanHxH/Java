package org.knit.lab6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> names =Arrays.asList(new String[]{"книга", "ручка", "линейка", "пинал", "ведьмак", "знак", "предназначение", "элексир"});


        HashSet<Character> bilo = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("введтье р чтобы случайноБъ,");
        String option = scanner.next();
        String answer;
        if (Objects.equals(option, "р")) {

            Collections.shuffle(names);
            answer = names.iterator().next();
        } else {
            System.out.print("Введите слово: ");
            answer = scanner.nextLine();
        }
        char[] letters = answer.toCharArray();
        List<Character> view = new ArrayList<Character>();
        List<Character> inputletters = new ArrayList<Character>();
        for (char letter : letters) {
            view.add('_');
            inputletters.add(letter);
        }
        String viewOutput = view.toString().substring(1, 3 * view.size() - 1).replaceAll(", ", "");
        System.out.println(viewOutput);
        int lives = 6;
        boolean isPlay=true;
        while (isPlay) {

            System.out.print("Введите букву: ");
            option = scanner.next();
            for (char ha : option.toCharArray()) {
                if (!bilo.contains(ha)) {
                    if (inputletters.contains(ha)) {
                        for (int i = 0; i < inputletters.size(); i++) {
                            if (inputletters.get(i) == ha) {
                                view.set(i, ha);
                            }
                        }
                    } else {
                        System.out.println("wrong");
                        lives--;
                    }
                    bilo.add(ha);
                } else {
                    System.out.println("bilo");
                }
                viewOutput = view.toString().substring(1, 3 * view.size() - 1).replaceAll(", ", "");
                System.out.println(viewOutput + "  Попыток: " + lives);
                if (lives == 0) {
                    System.out.println("LOOSER");
                    isPlay=false;
                    break;
                }
                if (view.containsAll(inputletters) && inputletters.containsAll(view)) {
                    System.out.println("Winner");
                    isPlay=false;
                    break;
                }
            }


        }

    }
}