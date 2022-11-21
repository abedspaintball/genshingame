import java.util.Scanner;
// import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class GenshinGame {

    public static void main(String[] args) {

        System.out.print("Welcome to the What Genshin Element Are You Quiz!!!1!11!\n");
        System.out.print("- answer each question with the corresponding number\n");
        System.out.print("- hit enter when you're finished to move on\n");
        System.out.print("- have fun!\n");
        System.out.print("-----------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);

        int anemoScore = 0;
        int geoScore = 0;
        int hydroScore = 0;
        int pyroScore = 0;
        int cryoScore = 0;
        int electroScore = 0;
        int dendroScore = 0;

        System.out.print("Do you like to cook?\n");
        System.out.print("1) Always\n");
        System.out.print("2) Sometimes\n");
        System.out.print("3) Not particularly\n");
        System.out.print("4) Never\n");
        int ans = input.nextInt();

        if (ans == 1) {
            pyroScore = pyroScore + 1;
        } else if (ans == 4) {
            cryoScore = cryoScore + 1;
        }

        System.out.println("-----------------------------------------------------------\n");
        
        System.out.print("What is your favorite season?\n");
        System.out.print("1) Winter\n");
        System.out.print("2) Summmer\n");
        System.out.print("3) Spring\n");
        System.out.print("4) Fall\n");
        ans = input.nextInt();

        if (ans == 1) {
            cryoScore = cryoScore + 1;
        } else if (ans == 2) {
            pyroScore = pyroScore + 1;
        } else {
            dendroScore = dendroScore + 1;
        }

        System.out.println("-----------------------------------------------------------\n");

        System.out.print("What is your favorite core subject?\n");
        System.out.print("1) Math\n");
        System.out.print("2) English\n");
        System.out.print("3) Science\n");
        System.out.print("4) Social Studies\n");
        ans = input.nextInt();

        if (ans == 1) {
            dendroScore = dendroScore + 1;
        } else if (ans == 2 || ans == 3) {
            hydroScore = hydroScore + 1;
        } else {
            anemoScore = anemoScore + 1;
        }

        System.out.print("------------------------------------------------------------\n");
        
        System.out.print("When facing an emeny, would you rather...\n");
        System.out.print("1) Defeat the enemy by crowd control\n");
        System.out.print("2) Stop the enemy from movement\n");
        System.out.print("3) Use brute force to hurt the enemy\n");
        System.out.print("4) Steathely approach the enemy.\n");
        ans = input.nextInt();
        
        if (ans == 1) {
            anemoScore = anemoScore + 1;
        } else if (ans == 2) {
            cryoScore = cryoScore + 1;
        } else if (ans == 3) {
            geoScore = geoScore + 1;
        } else {
            electroScore = electroScore + 1;
        }
        
        System.out.println("-----------------------------------------------------------\n");
        
        System.out.print("When in a team composition of four, what is your preferred position?\n");
        System.out.print("1) Main damager dealer, I want to be the star of the show.\n");
        System.out.print("2) Second damager dealer, I want the glory without the responsibility.\n");
        System.out.print("3) Support and or defense, I want to keep the team out of harms way.\n");
        System.out.print("4) Healer, I want to make sure the team is at their best.\n");
        ans = input.nextInt();
        
        if (ans == 1 || ans == 4) {
            hydroScore = hydroScore + 1;
            anemoScore = anemoScore + 1;
        } else if (ans == 2) {
            pyroScore = pyroScore + 1;
        } else {
            electroScore = electroScore + 1;
            dendroScore = dendroScore + 1;
            cryoScore = cryoScore + 3;
        }
        
        System.out.println("-----------------------------------------------------------\n");
        
        System.out.print("What is your weapon of choice?\n");
        System.out.print("1) Sword, I like skilled close combat.\n");
        System.out.print("2) Claymore, I like just beating the enemy and breaking various defenses.\n");
        System.out.print("3) Bow, I like ranged combat\n");
        System.out.print("4) Polearm, I like using weapons that feel like an extension of my body\n");
        ans = input.nextInt();
        
        if (ans == 1) {
            cryoScore = cryoScore + 2;
        } else if (ans == 2) {
            geoScore = geoScore + 1;
            electroScore = electroScore + 1;
        } else if (ans == 3) {
            hydroScore = hydroScore + 1;
        } else {
            pyroScore = pyroScore + 1;
            anemoScore = anemoScore + 1;
        }
        
        System.out.println("-----------------------------------------------------------\n");
        
        System.out.print("Imagine you are able to cast spells using a book. What spells appeal to you?\n");
        System.out.print("1) A spell that makes anyone fall in love with me.\n");
        System.out.print("2) A spell that heals any wound on me or others.\n");
        System.out.print("3) A spell that tells me the future.\n");
        System.out.print("4) A spell that shields me from outside attacks.\n");
        ans = input.nextInt();
        
        if (ans == 1) {
            electroScore = electroScore + 2;
        } else if (ans == 2) {
            hydroScore = hydroScore + 2;
            anemoScore = anemoScore + 1;
        } else if (ans ==3) {
            hydroScore = hydroScore + 1;
            dendroScore = dendroScore + 2;
        } else {
            geoScore = geoScore + 1;
        }
        
        System.out.println("-----------------------------------------------------------\n");
        
        System.out.print("What is your favorite animal?\n");
        System.out.print("1) Bear\n");
        System.out.print("2) Shark\n");
        System.out.print("3) Wolf\n");
        System.out.print("4) Falcon\n");
        ans = input.nextInt();
        
        if (ans == 1) {
            geoScore = geoScore + 2;
        } else if (ans == 2) {
            hydroScore = hydroScore + 1;
        } else if (ans == 3) {
            cryoScore = cryoScore + 1;
        } else {
            pyroScore = pyroScore + 1;
            dendroScore = dendroScore + 1;
        }
        
        System.out.println("-----------------------------------------------------------\n");
        
        System.out.print("In a character, I like...\n");
        System.out.print("1) One that relies on attack and crit damage,\n");
        System.out.print("2) One that relies on elemental mastery.\n");
        System.out.print("3) One that relies on health points.\n");
        System.out.print("4) One that relies on defense.\n");
        ans = input.nextInt();
        
        if (ans == 1) {
            dendroScore = dendroScore + 1;
            pyroScore = pyroScore + 2;
        } else if (ans == 2) {
            anemoScore = anemoScore + 2;
            hydroScore = hydroScore + 1;
        }
        
        System.out.println("-----------------------------------------------------------\n");
        
        System.out.print("Lastly, what words best describe you?\n");
        System.out.print("1) Charismatic, determined, intimidating.\n");
        System.out.print("2) Joyful, athletic, friendly.\n");
        System.out.print("3) Intelligent, keen, aloof.\n");
        System.out.print("4) Sharp, witty, forward.\n");
        ans = input.nextInt();
        
        if (ans == 1) {
            hydroScore = hydroScore + 1;
            geoScore = geoScore + 1;
        } else if (ans == 2) {
            pyroScore = pyroScore + 1;
        } else if (ans == 3) {
            cryoScore = cryoScore + 2;
            dendroScore = dendroScore + 2;
            anemoScore = anemoScore + 1;
        } else {
            anemoScore = anemoScore + 1;
        }
        
        System.out.print("------------------------------------------------------------\n");

        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(anemoScore);
        scores.add(geoScore);
        scores.add(electroScore);
        scores.add(hydroScore);
        scores.add(pyroScore);
        scores.add(dendroScore);
        scores.add(cryoScore);

        if (Collections.max(scores).equals(anemoScore)) {
            System.out.print("You got ANEMO!\n");
            System.out.print("You are precise on important tasks and calm under pressure.\n");
            System.out.print("Many people come to you for wisdom and guidance as you offer the most helpful solutions.\n");
        } else if (Collections.max(scores).equals(pyroScore)) {
            System.out.print("You got PYRO!\n");
            System.out.print("You are fearless in the face of danger and put others' lives before your own.\n");
            System.out.print("Getting your own way is your specialty, but you never let others down.\n");
        } else if (Collections.max(scores).equals(geoScore)) {
            System.out.print("You got GEO!\n");
            System.out.print("You are extremely hardworking and determined beyond belief.\n");
            System.out.print("The goals you have are the most important thing to you.\n");
        } else if (Collections.max(scores).equals(electroScore)) {
            System.out.print("You got ELECTRO!\n");
            System.out.print("You value friendships over anything else.\n");
            System.out.print("Remind yourself that being alone doesn't mean you are lonely.\n");
        } else if (Collections.max(scores).equals(hydroScore)) {
            System.out.print("You got HYDRO!\n");
            System.out.print("You are intellgent in ways people don't expect.\n");
            System.out.print("Don't let your feelings get in the way of your potential.\n");
        } else if (Collections.max(scores).equals(cryoScore)) {
            System.out.print("You got CRYO!\n");
            System.out.print("You are charismatic under pressure and charm your way out of danger.\n");
            System.out.print("Be careful not to drive away those closest to you.\n");
        } else if (Collections.max(scores).equals(dendroScore)) {
            System.out.print("You got DENDRO!\n");
            System.out.print("You have genius in all skils you hone.\n");
            System.out.print("Fear those too stupid to know your power.\n");
        }

        input.close();

    }
}


