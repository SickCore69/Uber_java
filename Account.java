class Account{      /* Declaracion de clase */
    public static void main(String[] args) {    /* Inicializacion de metodo main */    
        //Tipo de dato y nombre de atributo
        Integer ID;
        String name;
        String document;
        String email;
        String password;

        public Account(String name, String document){   /* Declaracion de metodo "Account" con los parametros minimos para que pueda ser creado un objeto de tipo Account */
            this.name = name;   //Atributo name = parametro name                      
            this.name = document;   //Atributo document = parametro document
        }
    }
}