package banking;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String s="Welcome to the ESIEA BANK AGENCY";
        System.out.println(s);

        while(1==1) {
            System.out.println("Que souhaitez-vous faire ? [h for help]");
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            //System.out.println(a);
            switch (a) {
                case "h":
                    System.out.println("u:Créer un nouvel utilisateur. \nh:Afficher les actions possibles. \nq:Quitter le programme. \n");
                    break;
                case "q":
                    System.out.println("Au revoir !");
                    System.exit(0);
                    break;
                case "u": User user = new User();
                          System.out.println("Quel est votre nom ?");
                          user.name = scan.next();
                          System.out.println("Quel est votre âge ?");
                          user.age = scan.nextInt();
                          String test = null;
                          while(test != "q") {
                              System.out.println("Que souhaitez-vous faire " + user.name + " ? [h for help]");
                              String b = scan.next();
                              switch(b) {
                                  case "h":
                                      System.out.println("l:Lister les comptes. \nc:Créer un nouveau compte. \nd:Deposer de l'argent. \nw:Retirer de l'argent. \na:Demander un crédit. \nt:Faire un virement. \nh:Afficher les actions possibles. \nq:Quitter le programme. \n");
                                      break;
                                  case "l":
                                      user.showAcc();
                                      break;
                                  case "c":
                                      user.newAcc();
                                      break;
                                  case "d":
                                      System.out.println("Sur quel compte souhaitez_vous faire votre dépot " + user.name + " ?");
                                      int Acc_ID = scan.nextInt();
                                      System.out.println("D'accord, quel montant voulez-vous déposer ?");
                                      double sum = scan.nextDouble();
                                      //user.deposit(user.list.get(Acc_ID),sum);
                                      break;
                                  case "w":
                                      break;
                                  case "a":
                                      break;
                                  case "t":
                                      if (user.number_of_Acc() < 2) {
                                          //demander le montant du virement et le compte cible et emetteur puis faire la transaction
                                      } else
                                          System.out.println("Vous devez avoir au moins deux compte pour pouvoir fire un virement.");
                                      break;
                                  case "q":
                                      test = "q";
                                      break;
                                  default:
                                      break;
                              }
                          }
                    break;
                default:
                    System.out.println("Unknown entry");
                    break;
            }
        }
    }
}
