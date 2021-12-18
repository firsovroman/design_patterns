package com.firsov.design_patterns.L_state.third;

public class DeveloperDayClient {

    public static void main(String[] args) {

        Developer developer = new Developer();
        Activity activity = new Sleeping(developer);

        developer.changeActivity(activity);

        for(int i =0; i < 10; i++) {
            developer.justDoIt();
        }

    }

}
