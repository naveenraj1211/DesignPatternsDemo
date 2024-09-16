package org.example.flyweight.graphicalediting;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@ExtrinsicState
public class GraphicExtrinsicState {

  
    private int x, y; // Coordinates
    private GraphicIntrinsicState intrinsicState; // The intrinsic state of the graphic
    
}