package org.example.practika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PerformanceManager {
    private final Performer mage;
    private final Performer warrior;
    private final Performer druid;

    @Autowired
    public PerformanceManager(Performer mage, Performer warrior, Performer druid) {
        this.mage = mage;
        this.warrior = warrior;
        this.druid = druid;
    }


    public void startPerformance() {
        System.out.println("Start performance...");
        mage.perform();
        warrior.perform();
        druid.perform();
        System.out.println("Performance done!");
    }


}
