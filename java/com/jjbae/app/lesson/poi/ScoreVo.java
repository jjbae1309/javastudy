package com.jjbae.app.lesson.poi;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ScoreVo {
	private Team awayTeam;
	private int awayTeamScore;
	private Team homeTeam;
	private int homeTeamScore;
	
	public Team getAwayTeam() {
		return awayTeam;
	}
	
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public int getAwayTeamScore() {
		return awayTeamScore;
	}
	
	public void setAwayTeamScore(int awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}
	
	public Team getHomeTeam() {
		return homeTeam;
	}
	
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	public int getHomeTeamScore() {
		return homeTeamScore;
	}
	
	public void setHomeTeamScore(int homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
