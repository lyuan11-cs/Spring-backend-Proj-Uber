package demo.service;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import demo.model.CurrentPosition;

public interface PositionService {

    void processPositionInfo(long id,
                             CurrentPosition currentPosition,
                             boolean exportPositionsToKml,
                             boolean sendPositionsToIngestionSerice);

}