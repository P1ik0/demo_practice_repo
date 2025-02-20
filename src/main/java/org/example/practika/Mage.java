package org.example.practika;

import org.springframework.stereotype.Component;

@Component
public class Mage implements Performer{

    @Override
    public void perform() {
        System.out.println("Mage is casting a FIREBALL");
    }
}
