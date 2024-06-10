package visao;
 /* A classe Mensagens representa uma exceção personalizada que pode ser lançada
 * para fornecer mensagens específicas ao usuário.
 */
public class Mensagens extends Exception {

    /**
     * Cria uma nova instância de Mensagens com a mensagem fornecida.
     *
     * @param mensagem a mensagem específica associada a esta exceção
     */
    public Mensagens(String mensagem) {
        super(mensagem);
    }
}