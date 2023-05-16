public class TVShow{
    private String showName;
    private Int numberOfEpisodes;
    private String genre;

    public TVShow(String showName, Int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }
    public String getShowName (){
        return showName;
    }
    public Int getEpisodes(){
        return numberOfEpisodes;
    }
    public String getGenre(){
        return genre;
    }
    @Override
    public String toString(){
        return "Show name: " + showName + "Number of episodes: " + numberOfEpisodes + "Genre: "+ genre;
    }
}
