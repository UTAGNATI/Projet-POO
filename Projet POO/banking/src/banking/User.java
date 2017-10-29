package banking;
import java.util.LinkedList;
import java.util.List;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ListIterator;

public class User {
    String name;
    int age;
    int Acc_ID;

    List list = new LinkedList(); // liste de compte
    Hashtable ht = new Hashtable();
    //Enumeration e = ht.elements();
    //Enumeration m = ht.keys();

    public void newAcc() {
        Account acc = new Account();
        list.add(acc); // numero de compte
    }

    public void throwAcc(int Acc_ID) {
        list.remove(Acc_ID);
    }

    public int number_of_Acc() {
        return list.size();
    }

    public void deposit(Account acc,double sum) {
        if(sum >= 0) {
            acc.Amount += sum;
        }
        else System.out.println("Montant négatif!!");
    }

    public void retrait(Account acc, double sum) {
        if(sum >= 0 && sum < acc.Amount) {
            acc.Amount -=sum;
        }
        else System.out.println("Montant négatif ou supérieur à votre capital!!");
    }

    public void showAcc() {
        if(list.size() != 0) {
            System.out.println("Voici la liste de vos comptes " + name + ".");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Vous avez " + list.get(i) + " € sur le compte " + i);
            }
        }
        else System.out.println("Vous n'avez aucun compte chez nous.");
    }

    public void credit(Credit credit, List credList) { //crée un crédit
        if(credit.duration > 70-age) System.out.println("Impossible! Trop long.");
        else if(credit.Amount < 0) System.out.println("Impossible! Montant négatif.");
        else if(credit.rates < 1.0) System.out.println("Impossible! Taux inférieur à 1%.");
        else if(credList.size() >= 2) System.out.println("Impossible! Vous avez déjà 2 crédits.");
        else credList.add(credit.Amount); //ajoute un crédit à la liste....
    }

    public void showCredit(List credList) { //liste les crédits
        if(credList.size() != 0) {
            System.out.println("Voici la liste des crédits en cour " + name + ".");
            for (int i = 0; i < credList.size(); i++) {
                System.out.println("Vous devez " + credList.get(i) + " € pour le crédit " + i);
            }
        }
        else System.out.println("Vous n'avez aucun crédit en cour.");
    }
}
