package annotations;

@PrimeiraAnotacao(value = "Teste", bairros = {"COHAB", "GRANJA"})
public class ClasseComAnotacao {

    //@PrimeiraAnotacao usado com ElementType.FIELD
    private String name;

    @PrimeiraAnotacao(value = "Teste", bairros = {"COHAB", "GRANJA"}, valores = 400d)
    public ClasseComAnotacao() {

    }
}
