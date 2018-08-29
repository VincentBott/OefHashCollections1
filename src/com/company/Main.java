package com.company;


import java.util.HashSet;
import java.util.Objects;

class OefSet1 {

    public static void main(String[] args) {

        HashSet<Auto> databank = new HashSet<>();

        databank.add(new Auto("1-SKY", "Karen"));
        databank.add(new Auto("1-ABC-123", "Kristel"));
        databank.add(new Auto("19-GR-LL", "Josje"));
        databank.add(new Auto("1-SKY", "Marthe"));

        for(Auto auto: databank){
            System.out.printf("%s bestuurd door %s%n", auto.getNummerplaat(), auto.getBestuurder());
        }
    }
}


class Auto {

    private String bestuurder;
    private String nummerplaat;


    public Auto(String nummerplaat, String bestuurder) {
        this.nummerplaat = nummerplaat;
        this.bestuurder = bestuurder;

    }



    public String getNummerplaat() {
        return this.nummerplaat;
    }


    public String getBestuurder() {

        return this.bestuurder;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Auto that = (Auto) o;

        return Objects.equals(nummerplaat, that.nummerplaat);

    }


    @Override
    public int hashCode() {

        return Objects.hashCode(nummerplaat);

    }
}

