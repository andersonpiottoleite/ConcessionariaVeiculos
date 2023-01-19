package exemplo.heranca;

public class TesteArvoreDeHeranca {

    public static void main(String[] args) {
        ClasseNeto neto = new ClasseNeto("valorNeto", "ValorPai", "valorVovo");
        System.out.println(neto.atributoNeto);
        System.out.println(neto.atributoPai);
        System.out.println(neto.atributoVovo);

        System.out.println("--------------------------");

        ClasseNeto.ClasseNetoBuilder builder = new ClasseNeto.ClasseNetoBuilder();

        ClasseNeto netoPeloBuilder = builder.atributoNeto("neto pelo builder")
                .atributoPai("pai pelo builder")
                .atributoVovo("vovo pelo builder")
                        .build();

        System.out.println(netoPeloBuilder.atributoNeto);
        System.out.println(netoPeloBuilder.atributoPai);
        System.out.println(netoPeloBuilder.atributoVovo);
    }
}
