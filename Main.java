import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        manager.addCharacter(new Character("Arjuna", CharacterType.WARRIOR, 2));
        manager.addCharacter(new Character("Luna", CharacterType.MAGE, 3));
        manager.addCharacter(new Character("Raven", CharacterType.ARCHER, 4));

        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(manager.getCharacters());
            window.setVisible(true);
        });
    }
}