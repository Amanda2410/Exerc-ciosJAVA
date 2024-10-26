public class Main {
    public static void main(String[] args) {
        // Criando um Padawan
        Padawan pdw = new Padawan("Luke", 100);
        System.out.println(pdw.nome + " é um " + pdw.genero + " com força " + pdw.forca);

        // Criando um Cavaleiro Jedi
        Cavaleiro c1 = new Cavaleiro("Obi-Wan", 150);
        System.out.println(c1.nome + " é um " + c1.genero + " com força " + c1.forca);

        // Criando um Mestre Jedi
        MestreJedi mJ = new MestreJedi("Yoda", 200);
        System.out.println(mJ.nome + " é um " + mJ.genero + " com força " + mJ.forca);
        mJ.usarRaio();
        System.out.println(mJ.nome + " tem uma força extra de " + mJ.forcaExtra());

        // Criando um Lord Sith
        Lord lord = new Lord("Darth Vader", 180);
        System.out.println(lord.nome + " é um " + lord.genero + " com força " + lord.forca);

        // Criando um Mestre Sith
        MestreSith mS = new MestreSith("Darth Sidious", 250);
        System.out.println(mS.nome + " é um " + mS.genero + " com força " + mS.forca);
        mS.usarRaio();
        System.out.println(mS.nome + " tem uma força extra de " + mS.forcaExtra());

        //Criando aprendiz
        Aprendiz aprendiz = new Aprendiz("Darth Maul", 40);
        System.out.println(aprendiz.nome + " é um " + aprendiz.genero + " com força " + aprendiz.forca);

        // Simulando um ataque
        mS.atacar(mJ);  // Mestre Sith ataca Jedi
        pdw.atacar(mS); //Padawan ataca Sith
        c1.atacar(mS);  //Cavaleiro ataca Mestre Sith
        mJ.usarRaio(); //Mestre Jedi usa raios
        pdw.atacar(aprendiz); //Padawan ataca aprendiz
        mS.usarRaio(); //Mestre Sith usa raios
        pdw.atacar(lord); //Padawan ataca Lord
        mJ.voadora(lord); //Mestre Jedi ataca Lord
        mJ.voadora(aprendiz); //Mestre Jedi ataca aprendiz
    }
}