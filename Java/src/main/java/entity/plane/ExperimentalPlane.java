package entity.plane;

import entity.type.ClassificationType;
import entity.type.ExperimentalType;

public class ExperimentalPlane extends Plane{

    private ExperimentalType experimentalType;
    private ClassificationType classificationType;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance,
                             int maxLoadCapacity, ExperimentalType type, ClassificationType classificationType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = type;
        this.classificationType = classificationType;
    }

    public ClassificationType getClassificationType(){
        return classificationType;
    }

    public void setClassificationType(ClassificationType classificationType){
        this.classificationType = classificationType;
    }

    public ExperimentalType getExperimentalType(){
        return experimentalType;
    }

    public void setExperimentalType(ExperimentalType experimentalType){
        this.experimentalType = experimentalType;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
