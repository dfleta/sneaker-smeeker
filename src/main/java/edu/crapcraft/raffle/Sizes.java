package edu.crapcraft.raffle;

import java.util.EnumSet;
import java.util.Set;

public enum Sizes {
    
    TREINTAYNUEVE("6.5 US", "39 EU"), CUARENTA("7.0 US", "40 EU"), CUARENTAYMEDIO("7.5 US", "40 1/2 EU"), CUARENTAYUNO("8.0 US", "41 EU"), CUARENTAYDOS("8.5 US", "42 EU"), CUARENTAYDOSYMEDIO("9.0 US", "42 1/2 EU"), CUARENTAYTRES("9.5 US", "43 EU");

    private String USsize = "";
    private String EUsize = "";

    private Sizes(String USsize, String EUsize) {
        this.USsize = USsize;
    }

    public String getUSsize() {
        return this.USsize;
    }

    public static Set<Sizes> getSizes(Sizes min, Sizes max) {
        return EnumSet.range(min, max);
    }
}
