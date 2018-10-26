package demo.service;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import demo.model.GpsSimulatorRequest;
import demo.model.Point;
import demo.task.GpsSimulator;

import java.io.File;
import java.util.List;

public interface GpsSimulatorFactory {

    GpsSimulator prepareGpsSimulator(GpsSimulatorRequest gpsSimulatorRequest);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, File kmlFile);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, List<Point> points);

}