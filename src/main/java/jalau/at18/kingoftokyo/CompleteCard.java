package jalau.at18.kingoftokyo;

public class CompleteCard extends Card{

    public CompleteCard(DiscardCards card) {
        super(card.name(), card.getCost());
    }

    @Override
    void setDescription() {
        
    }
    
}
