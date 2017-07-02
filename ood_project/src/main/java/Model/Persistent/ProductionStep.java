package Model.Persistent;


import java.util.List;

/**
 * Created by mohammad on 6/28/2017.
 */
public class ProductionStep {

    private Integer id;
    private Integer cost;
    private String preCondition;
    private String postCondition;
    private List<Storable> inputs;
    private List<Storable> outputs;
    private List<String> suggestions;
    private List<Employee> peopleInvolved;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getPreCondition() {
        return preCondition;
    }

    public void setPreCondition(String preCondition) {
        this.preCondition = preCondition;
    }

    public String getPostCondition() {
        return postCondition;
    }

    public void setPostCondition(String postCondition) {
        this.postCondition = postCondition;
    }

    public List<Storable> getInputs() {
        return inputs;
    }

    public void setInputs(List<Storable> inputs) {
        this.inputs = inputs;
    }

    public List<Storable> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<Storable> outputs) {
        this.outputs = outputs;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }

    public List<Employee> getPeopleInvolved() {
        return peopleInvolved;
    }

    public void setPeopleInvolved(List<Employee> peopleInvolved) {
        this.peopleInvolved = peopleInvolved;
    }
}
