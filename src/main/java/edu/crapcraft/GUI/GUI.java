package edu.crapcraft.GUI;

import edu.crapcraft.raffle.Entry;
import edu.crapcraft.raffle.Raffle;

public class GUI {

    public static void drawSneaker(Raffle sneaker) {
        System.out.println(
        "\n\n" +
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
        "\n\n" +
        "\t\t" + entry.toString());
    }
}
