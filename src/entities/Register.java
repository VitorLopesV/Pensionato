package entities;

public class Register {

    /**Atributo utilizado para armazenar o nome dos estudantes**/
    private String name;

    /**Atributo utilizado para armazenar o email dos estudantes**/
    private String email;

    /** Cosntrutor com valores name e email **/
        public Register(String name, String email){
            this.name = name;
            this.email = email;
        }

            // MÉTODOS SETTERS
            public void setName(String name) {
                this.name = name;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            // MÉTODOS GETTERS

            public String getName() {
                return name;
            }

            public String getEmail() {
                return email;
            }

            // MÉTODO TOSTRING
            public String toString(){
                return name + ", " + email;
            }
        }

