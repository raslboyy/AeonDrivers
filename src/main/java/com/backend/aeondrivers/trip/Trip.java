package com.backend.aeondrivers.trip;

import com.backend.aeondrivers.passenger.Passenger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Trip {
    private Destination from;
    private Destination to;
    private Double distance;
    private Double duration;
    private Time time;
    private ArrayList<Passenger> passengers;
    private Cost cost;
}
