import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static String nomeMod = "modtutorial";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Integer, Runnable> criar = new HashMap<>(); 
        criar.put(1, () -> criarBloco());
        criar.put(2, () -> criarItemGenerico());
        criar.put(3, () -> criarFerramenta());
        criar.put(4, () -> criarItem3D());
        System.out.println("1 - Criar Bloco");
        System.out.println("2 - Criar Item");
        System.out.println("3 - Criar Ferramenta");
        System.out.println("4 - Criar Item 3D");
        System.out.print("Escolha: ");
        int escolha = scan.nextInt();
        scan.nextLine();
        criar.getOrDefault(escolha, () -> System.out.println("Não foi")).run();
    }

    public static void criarBloco() {
        System.out.print("Insira o nome do bloco: ");
        String nome = scan.nextLine();
        CreateBlock bloco = new CreateBlock(nomeMod, nome);
        bloco.createBlockItem();
        System.out.println("Bloco criado.");
    }

    public static void criarItemGenerico() {
        System.out.print("Insira o nome do item: ");
        String nome = scan.nextLine();
        CreateItem item = new CreateItem(nomeMod, nome);
        item.createGenericItem();
        System.out.println("Item criado.");
    }

    public static void criarFerramenta() {
        System.out.print("Insira o nome do item: ");
        String nome = scan.nextLine();
        CreateItem item = new CreateItem(nomeMod, nome);
        item.createToolItem();
        System.out.println("Item criado.");
    }

    public static void criarItem3D() {
        System.out.print("Insira o nome do item: ");
        String nome = scan.nextLine();
        CreateItem item = new CreateItem(nomeMod, nome);
        item.create3DToolItem();
        System.out.println("Item criado.");
    }
}
