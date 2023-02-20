package edu.crapcraft.GUI;

import edu.crapcraft.raffle.Entry;
import edu.crapcraft.raffle.Raffle;

public class GUI {

    public static void drawSneaker(Raffle sneaker) {
        System.out.println(
        "\t\t" + " _    _" + "\n" +
        "\t\t" + "(_\\__/(,_" + "\n" +
        "\t\t" + "| \\ `_////-._" + "\n" +
        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
        "\t\t" + "|=====;__/___./" + "\n" +
        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +
        "\t\t" + sneaker.toString());
    }

    public static void drawEntry(Entry entry) {
        System.out.println(
        "\t\t" + entry.toString() + "\n");
    }

    public static void drawWinner(Entry entry) {
        System.out.print(
        "\n\n\t\t¡¡ You are a Winner !!: ");
        GUI.drawEntry(entry);
    }
}
