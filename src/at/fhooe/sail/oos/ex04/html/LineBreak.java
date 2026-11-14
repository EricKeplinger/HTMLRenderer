package at.fhooe.sail.oos.ex04.html;

// TODO inherit from superclass with keyword extends
class LineBreak extends TaggedElement{
	// TODO override inherited abstract methods getTag() and render()
    @Override
    String getTag(){
        return "br";
    }
    @Override
    String render(){
        String br = "<" + this.getTag() + "/>";
        Element brLine = new Text(br);
        return brLine.render();
    }

}