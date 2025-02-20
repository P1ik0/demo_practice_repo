package org.example.practika;

import org.springframework.stereotype.Component;

@Component
public class Warrior  implements Performer{
    @Override
    public void perform() {
        System.out.println("Warrior is training with a longsword");
    }
}
