package models;

public class CyclingApp {

    public static final int QUOTAS_BY_CATEGORY = 10;
    public static final int YOUTH_AGE = 10;
    public static final int SENIOR_AGE = 20;
    public static final int MASTER_AGE = 30;
    public static final int REGISTRATION_VALUE = 11000;

    private int youthQuotas;
    private int seniorhQuotas;
    private int masterQuotas;

    public boolean registerParticipant(int age) {
        boolean canParticipate = false;
        if ((age >= YOUTH_AGE && age <= SENIOR_AGE) && youthQuotas < QUOTAS_BY_CATEGORY) {
            youthQuotas++;
            canParticipate = true;
        } else if ((age > SENIOR_AGE && age <= MASTER_AGE) && seniorhQuotas < QUOTAS_BY_CATEGORY) {
            seniorhQuotas++;
            canParticipate = true;
        } else if ((age > MASTER_AGE) && masterQuotas < QUOTAS_BY_CATEGORY) {
            masterQuotas++;
            canParticipate = true;
        }
        return canParticipate;
    }

    public double getAwardValue(Category category) {
        double awardValue = 0;
        switch (category) {
            case JUNIOR:
                awardValue = youthQuotas * REGISTRATION_VALUE;
                break;
            case SENIOR:
                awardValue = seniorhQuotas * REGISTRATION_VALUE;
                break;
            case MASTER:
                awardValue = masterQuotas * REGISTRATION_VALUE;
                break;
            default:
                break;
        }
        return awardValue;
    }

    public int getYouthQuotas() {
        return youthQuotas;
    }

    public int getSeniorhQuotas() {
        return seniorhQuotas;
    }

    public int getMasterQuotas() {
        return masterQuotas;
    }
}