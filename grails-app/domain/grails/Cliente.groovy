package grails

class Cliente {
    String nome
    String cpf
    Date dataNascimento
    String classeSocial

    static constraints = {
        classeSocial inList: ["BAIXA","MÉDIA","ALTA"]
    }

    static mapping = {
        table name: "cli_cliente"
    }
}
