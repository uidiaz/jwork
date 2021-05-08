/**
 * Merupakan class untuk Database Bonus
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version  22 April 2021
 */

import java.util.ArrayList;

public class DatabaseBonus
{
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                temp = bonus;
                return temp;
            }
        }

        if (temp == null){
            throw new BonusNotFoundException(id);
        }
        return temp;
    }

    public static Bonus getBonusByRefferalCode(String refferalCode){
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (refferalCode.equals(bonus.getReferralCode())) {
                x = bonus;
            }
        }
        return x;
    }

    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for(Bonus bonuses : BONUS_DATABASE) {
            if(bonuses.getReferralCode() == bonus.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }

        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activateBonus(int id){
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                x = true;
            }
        }
        return x;
    }

    public static boolean deactivateBonus(int id){
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                x = true;
            }
        }
        return x;
    }

    public static boolean removeBonus(int id) throws RecruiterNotFoundException{
        boolean status = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                status = true;
                break;
            }
        }

        if (!status){
            throw new RecruiterNotFoundException(id);
        }
        return false;
    }
}