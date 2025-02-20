package org.example.practika;

import org.springframework.stereotype.Component;

@Component
public class Druid implements Performer {
    @Override
    public void perform() {
        System.out.println("Druid became a cat. Meaow~ ");
    }
}
