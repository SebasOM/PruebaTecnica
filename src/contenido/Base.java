package contenido;
import java.util.Objects;
import java.util.Scanner;
public class Base {
    private static int op;
    private static int op2;
    private static int op3;
    private static int op4;

    public static void main(String[] args) {


        Scanner lea = new Scanner(System.in);

        System.out.println("\nBienvenido, ¿Desea buscar información entre las bases de datos? (SI/NO)");
        String ele = lea.next();

        while ((Objects.equals(ele, "Si")) || (Objects.equals(ele, "si"))){

            while(op !=4){
                System.out.println("");
                System.out.println("1.Informacion de paises suramericanos");
                System.out.println("2.Informacion de mamiferos acuaticos");
                System.out.println("3.Informacion de Frutas dulces");
                System.out.println("4. Salir");

                System.out.println("\n Digite su opcion");
                op = lea.nextInt();

                switch (op){

                    case 1->{
                        System.out.println("\nPaises enlistados:");
                        System.out.println("\n 1.Argentina\n 2.Bolivia\n 3.Colombia\n " +
                                "4.Chile\n 5.Ecuador\n 6.Guatemala\n 7.Paraguay\n 8.Perú\n " +
                                "9.Uruguay\n 10.Venezuela");
                        System.out.println("");

                        System.out.println("Elija un País");
                        op2 = lea.nextInt();

                        switch(op2){

                            case 1->{
                                System.out.println(" *Capital: Buenos aires\n *Poblacion: 45,81 millones(2021)" +
                                        "\n *Extension territorial: 2,78 millones Km2");
                            }
                            case 2->{
                                System.out.println(" *Capital: Sucre\n *Poblacion: 12,08 millones(2021)" +
                                        "\n *Extension territorial: 2,78 millones Km2");
                            }
                            case 3->{
                                System.out.println(" *Capital: Bogotá\n *Poblacion: 51,52 millones(2021)" +
                                        "\n *Extension territorial: 1,142 millones Km2");
                            }
                            case 4->{
                                System.out.println(" *Capital: Santiago de chile\n *Poblacion: 19,49 millones(2021)" +
                                        "\n *Extension territorial: 756.626 Km2");
                            }
                            case 5->{
                                System.out.println(" *Capital: Quito\n *Poblacion: 17,8 millones(2021)" +
                                        "\n *Extension territorial: 256.370 Km2");
                            }
                            case 6->{
                                System.out.println(" *Capital: Ciudad de Guatemala\n *Poblacion: 17,11 millones(2021)" +
                                        "\n *Extension territorial: 108.888 Km2");
                            }
                            case 7->{
                                System.out.println(" *Capital: Asunción\n *Poblacion: 6,704 millones(2021)" +
                                        "\n *Extension territorial: 406.752 Km2");
                            }
                            case 8->{
                                System.out.println(" *Capital: Lima\n *Poblacion: 33,72 millones(2021)" +
                                        "\n *Extension territorial: 1,285 millones Km2");
                            }
                            case 9->{
                                System.out.println(" *Capital: Montevideo\n *Poblacion: 3,426 millones(2021)" +
                                        "\n *Extension territorial: 176.215 Km2");
                            }
                            case 10->{
                                System.out.println(" *Capital: Caracas\n *Poblacion: 28,2 millones(2021)" +
                                        "\n *Extension territorial: 916.445 Km2");
                            }
                            default -> System.out.println("\nIngrese una opcion valida");

                        }
                    }
                    case 2->{
                        System.out.println("\nAnimales enlistados:");
                        System.out.println("\n 1.Ballena\n 2.Beluga\n 3.Cachalote\n " +
                                "4.Castor\n 5.Delfín\n 6.Foca");
                        System.out.println("");

                        System.out.println("Elija un animal");
                        op3 = lea.nextInt();

                        switch (op3){
                            case 1->{
                                System.out.println("Ballena:  El animal más grande del planeta." +
                                        " Aunque viven en el agua, su alimentación se produce \nde la " +
                                        "misma forma que los mamíferos. Los ballenatos miden 7 " +
                                        "metros y pesan 2 toneladas al nacer.");
                            }
                            case 2->{
                                System.out.println("Beluga: Es un cetáceo adaptado al clima del Ártico, de " +
                                        "tamaño mayor a los delfines pero menor a las ballenas.");
                            }
                            case 3->{
                                System.out.println("Cachalote: Puede llegar a pear 50 toneladas, lo que lo \n" +
                                        "convierte en uno de los animales más grandes que existen (y el animal " +
                                        "con dientes más grande).\nAdemás, es el mamífero marino que " +
                                        "alcanza mayores profundidades.");
                            }
                            case 4->{
                                System.out.println("Castor: Existen tres especies a lo largo de la tierra. " +
                                        "Son muy conocidos por su característica de poder fabricar diques \n" +
                                        "talando árboles, y por ser una temible especie invasora.");
                            }
                            case 5->{
                                System.out.println("Delfin: Disponen de un cuerpo fusiforme con una cabeza " +
                                        "muy grande. Su coloración suele ser gris, y es capaz de emplear sonidos, \n" +
                                        "saltos y danzas para comunicarse con el entorno. Es por esto que se la " +
                                        "conoce como una de las especies más inteligentes.");
                            }
                            case 6->{
                                System.out.println("Foca:  Carecen por completo de oído externo, mientras que " +
                                        "sus extremidades traseras se encuentran dirigidas hacia atrás, por " +
                                        "\nlo que no son muy hábiles para el desplazamiento terrestre.");
                            }
                            default -> System.out.println("\nIngrese una opcion valida");

                        }
                    }
                    case 3->{
                        System.out.println("\nFrutas enlistadas:");
                        System.out.println("\n 1.Manzana\n 2.Papaya\n 3.Pera\n " +
                                "4.Platano\n 5.Sandía\n 6.Uva");
                        System.out.println("");

                        System.out.println("Elija una fruta");
                        op4 = lea.nextInt();

                        switch (op4){
                            case 1->{
                                System.out.println("Manzana: también llamada “pero” en algunas zonas de " +
                                        "España. Asimismo, es una fruta \ncomestible que procede al manzano " +
                                        "(Malus domestica)  y que es de la familia de las Rosáceas.\nEs la fruta " +
                                        "más antigua de la humanidad y es parte de nuestra historia. Además, el manzano " +
                                        "es \nárbol más cultivado a nivel mundial. Es muy rica en pectina, un nutriente " +
                                        "muy saludable que es \ncomún en todas sus variedades.");
                            }
                            case 2->{
                                System.out.println("Papaya: Se trata de una fruta de origen tropical como la guanábana, " +
                                        "la guayaba o el maracuyá. \nEs el fruto de un arbusto frutal que se llama Carica" +
                                        "papaya, comúnmente llamado papayo o \npapayero. Puede alcanzar los 10 metros de " +
                                        "altura. \n \nTiene una forma ovoide muy particular con una piel de color amarillo " +
                                        "verdoso. En el interior \nnos encontramos una pulpa carnosa de color anaranjado o " +
                                        "rojizo con unas semillas negras \nbrillantes. La textura es muy similar a la del " +
                                        "melón con una pulpa dulce y muy suave.");
                            }
                            case 3->{
                                System.out.println("Pera: La pera (Pyrus communis) es una de las frutas más populares de" +
                                        " las que \nse usa normalmente en una dieta diaria. Asimismo, es el fruto de " +
                                        "distintos \nárboles frutales caducifolios del género Pyrus que conocemos como " +
                                        "perales. \n \nSegún su clasificación, estaría dentro del grupo de las frutas dulces," +
                                        " como \nla fruta de la pasión.  Por lo tanto, su sabor es dulce y muy sabroso. " +
                                        "\nAdemás, gracias a la cantidad de agua que tiene es un alimento muy \nrefrescante," +
                                        " carnoso y jugoso que, además, nos hidrata.");
                            }
                            case 4->{
                                System.out.println("Platano: Este fruto de origen tropical que procede de una planta " +
                                        "herbácea de la \nfamilia Musaceae y del género Musa. Tiene forma alargada o " +
                                        "ligeramente curvada, \nde entre 100 y 200 gramos de peso. La piel es gruesa, de " +
                                        "color amarillo y fácil \nde pelar. Asimismo, la pulpa es blanca o amarillenta y " +
                                        "carnosa. También, son \nconocidos como bananas, guineos, bananos, maduros. " +
                                        "gualeles o cambures, según \nel lugar de procedencia.");
                            }
                            case 5->{
                                System.out.println("Sandia: es el fruto de la sandiera. Se trata de una planta de la " +
                                        "familia de las Cucurbitáceas, \nque incluye unas 850 especies de plantas herbáceas " +
                                        "que producen frutos generalmente de gran \ntamaño y protegidos por una corteza " +
                                        "dura. Existen variedades con semillas o sin semillas. Sin \nembargo, las semillas" +
                                        " de sandía (Citrullus lanatus) son ricas en fibra. Como consecuencia, \nfavorece " +
                                        "el tránsito intestinal y mejora las digestiones. \n \nEl color de la pulpa es roja, " +
                                        "pero existe también la «sandía melón» o Sandía amarilla. La \nvariedad amarilla " +
                                        "es muy popular en toda Europa por sus propiedades beneficiosas que nos \naportan " +
                                        "a nuestra salud.");
                            }
                            case 6->{
                                System.out.println("Uva: Es el fruto de una planta llamada vid (Vitis vinífera). Además, " +
                                        "es una planta muy popular y extendida \nen numerosos países, sobre todo del " +
                                        "hemisferio norte.  Sus frutos aparecen en forma de racimos que \nconocemos como " +
                                        "uvas. \n \nEsta fruta es de pulpa blanca, de tamaño pequeño y de forma ovalada y " +
                                        "dulce. En su exterior la protege una \nfina piel de color variada. Según la " +
                                        "variedad puede pasar de color verde al principio, al amarillo vivo. \nAdemás, si " +
                                        "se trata de uva tinta la evolución es de verde a rojo oscuro e intenso, a veces" +
                                        " azulado o \nvioleta. En el interior se encuentran las semillas o pepitas en " +
                                        "forma de pequeños granos.");
                            }
                            default -> System.out.println("\nIngrese una opción valida");
                        }
                    }

                }

            }
            System.out.println("¿Desea elegir otra opción?");
            ele = lea.next();
        }
    }
}
