package com.arkumbra.geotest.jma.xml;

public enum EventType {

    SeismicIntensity("震度速報"),
    Hypocentre("震源に関する情報"),
    IntensityHypocentre("震源・震度に関する情報"),
    Volcano("火山の状況に関する解説情報"),
    EruptionObservations("噴火に関する火山観測報"),
    VolcanicAshForecastDetailed("降灰予報（詳細）"),
    VolcanicAshForecastPeriodic("降灰予報（定時）")
    ;

    private String event;

    EventType(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

    public static EventType convert(String event) {
        for (EventType type : EventType.values()) {
            if (type.event.equals(event)) {
                return type;
            }
        }
        throw new RuntimeException("No constant for event type " + event);
    }
}
