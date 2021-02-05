/*
package com.company.SchoolProblems;

public class UMLExcersize {
    public static void main(String[] args){

    }
}
abstract class SportObject{
    String name;
    String location;
    int rank;
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getRank() {
        return rank;
    }
}
class Player extends SportObject{
    int height,weight,popularity, charityDonations;
    String impactOnSport,impactOnWorld;

    public Player(int height, int weight, int popularity, int charityDonations, String impactOnSport, String impactOnWorld) {
        this.height = height;
        this.weight = weight;
        this.popularity = popularity;
        this.charityDonations = charityDonations;
        this.impactOnSport = impactOnSport;
        this.impactOnWorld = impactOnWorld;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getCharityDonations() {
        return charityDonations;
    }

    public String getImpactOnSport() {
        return impactOnSport;
    }

    public String getImpactOnWorld() {
        return impactOnWorld;
    }
}
class BasketBallPlayer extends Player{
    int ppg,jumpHeight,fieldGoals;
    public BasketBallPlayer(int height, int weight, int popularity, int charityDonations, String impactOnSport, String impactOnWorld, int ppg, int jumpHeight, int fieldGoals) {
        super(height, weight, popularity, charityDonations, impactOnSport, impactOnWorld);
        this.ppg = ppg;
        this.jumpHeight = jumpHeight;
        this.fieldGoals = fieldGoals;
    }

    public int getPpg() {
        return ppg;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getFieldGoals() {
        return fieldGoals;
    }
}
class BaseballPlayer extends Player{
    int tounamentsWon, mostAces, mentalToughness,gender;

    public int getTounamentsWon() {
        return tounamentsWon;
    }

    public int getMostAces() {
        return mostAces;
    }

    public int getMentalToughness() {
        return mentalToughness;
    }

    public int getGender() {
        return gender;
    }

    public BaseballPlayer(int height, int weight, int popularity, int charityDonations, String impactOnSport, String impactOnWorld, int tounamentsWon, int mostAces, int mentalToughness, int gender) {
        super(height, weight, popularity, charityDonations, impactOnSport, impactOnWorld);
        this.tounamentsWon = tounamentsWon;
        this.mostAces = mostAces;
        this.mentalToughness = mentalToughness;
        this.gender = gender;
    }
}
class MaleBaseballPlayer extends BaseballPlayer{
    public MaleBaseballPlayer(int height, int weight, int popularity, int charityDonations, String impactOnSport, String impactOnWorld, int tounamentsWon, int mostAces, int mentalToughness){
        super( height,  weight,  popularity,  charityDonations,  impactOnSport,  impactOnWorld,  tounamentsWon,  mostAces,  mentalToughness, 0);
    }
}
class FemaleBaseballPlayer extends BaseballPlayer{
    public FemaleBaseballPlayer(int height, int weight, int popularity, int charityDonations, String impactOnSport, String impactOnWorld, int tounamentsWon, int mostAces, int mentalToughness){
        super( height,  weight,  popularity,  charityDonations,  impactOnSport,  impactOnWorld,  tounamentsWon,  mostAces,  mentalToughness, 1);
    }
}
class Team extends SportObject{
    Player[] players;
    int won,lost;
    String owner;

    public Team(Player[] players, int won, int lost, String owner) {
        this.players = players;
        this.won = won;
        this.lost = lost;
        this.owner = owner;
    }
    public Player[] getPlayers() {
        return players;
    }
    public int getWon() {
        return won;
    }
    public int getLost() {
        return lost;
    }
    public String getOwner() {
        return owner;
    }
}
class BasketballTeam extends Team{
    String coach,homeStadium;
    BasketballTeam rival;
    public BasketballTeam(BasketBallPlayer[] players, int won, int lost, String owner, String coach, String homeStadium, BasketballTeam rival) {
        super(players, won, lost, owner);
        this.coach = coach;
        this.homeStadium = homeStadium;
        this.rival = rival;
    }
    public String getCoach() {
        return coach;
    }
    public String getHomeStadium() {
        return homeStadium;
    }
    public BasketballTeam getRival() {
        return rival;
    }
}
class MaleBasketballTeam extends BasketballTeam{
    public MaleBasketballTeam(MaleBaseballPlayer[] players, int won, int lost, String owner, String coach, String homeStadium, BasketballTeam rival) {
        super(players, won, lost, owner, coach, homeStadium, rival);
    }
}
class FemaleBasketballTeam extends BasketballTeam{
    public FemaleBasketballTeam(FemaleBaseballPlayer[] players, int won, int lost, String owner, String coach, String homeStadium, BasketballTeam rival) {
        super(players, won, lost, owner, coach, homeStadium, rival);
    }
}
class BaseballTeam extends Team{
    int teamWork, conference, bracket, league;

    public BaseballTeam(Player[] players, int won, int lost, String owner, int teamWork, int conference, int bracket, int league, ) {
        super(players, won, lost, owner);
        this.teamWork = teamWork;
        this.conference = conference;
        this.bracket = bracket;
        this.league = league;
    }

    public int getTeamWork() {
        return teamWork;
    }

    public int getConference() {
        return conference;
    }

    public int getBracket() {
        return bracket;
    }

    public int getLeague() {
        return league;
    }


}
class EasternConference extends BaseballTeam{
    public EasternConference(Player[] players, int won, int lost, String owner, int teamWork, int bracket, int division) {
        super(players, won, lost, owner, teamWork, 0, bracket, division);
    }
}
class WesternConference extends BaseballTeam{
    public WesternConference(Player[] players, int won, int lost, String owner, int teamWork, int bracket, int division) {
        super(players, won, lost, owner, teamWork, 1, bracket, division);
    }
}
class MLB extends WesternConference{
    public MLB(Player[] players, int won, int lost, String owner, int teamWork, int bracket) {
        super(players, won, lost, owner, teamWork, bracket, 0);
    }
}
class AAABaseball extends WesternConference{
    public AAABaseball(Player[] players, int won, int lost, String owner, int teamWork, int bracket) {
        super(players, won, lost, owner, teamWork, bracket, 1);
    }
}*/
