public class Main {
    public static void main(String[] args) {
        Assalariado robson = new Assalariado();
        robson.setNome("Robson S.");
        robson.setCPF("123.456.789-10");
        System.out.println("O funcionário "+ robson.getNome() +" com o CPF: " + robson.getCPF() +" Recebeu: R$ "+ robson.calcularSalário());

        Horista pedro = new Horista();
        pedro.setNome("Pedro P.");
        pedro.setCPF("321.654.987-01");
        pedro.setHorasTrabalhadas(365);
        System.out.println("O funcionário "+ pedro.getNome() +" com o CPF: " + pedro.getCPF() +" Recebeu: R$ "+ pedro.calcularSalário());

        Comissionado aizen = new Comissionado();
        aizen.setNome("Sōsuke Aizen");
        aizen.setCPF("999.999.999-99");
        aizen.setTotalVendas(999);
        aizen.adicionarVenda(1563.50);
        aizen.adicionarVenda(1963.00);
        aizen.adicionarVenda(1353.99);
        aizen.adicionarVenda(1123.50);
        aizen.adicionarVenda(993.30);
        System.out.println("O funcionário "+ aizen.getNome() +" com o CPF: " + aizen.getCPF() +" Recebeu: R$ "+ aizen.calcularSalário());




        AssalariadoComissionado eiden = new AssalariadoComissionado();
        eiden.setNome("Dante Iguro Shihōin Winchester");
        eiden.setCPF("000.000.000-00");
        eiden.adicionarVenda(1354.60);
        eiden.adicionarVenda(5500.30);
        eiden.adicionarVenda(160.99);
        eiden.adicionarVenda(2353.50);
        eiden.adicionarVenda(2400.80);
        eiden.adicionarVenda(765.30);
        System.out.println("O funcionário "+ eiden.getNome() +" com o CPF: " + eiden.getCPF() +" Recebeu: R$ "+ eiden.calcularSalário());





    }
}