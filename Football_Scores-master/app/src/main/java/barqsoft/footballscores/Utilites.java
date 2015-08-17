package barqsoft.footballscores;

import android.content.Context;

/**
 * Created by yehya khaled on 3/3/2015.
 */
public class Utilites
{
//    public static final int SERIE_A = 357;
//    public static final int PREMIER_LEGAUE = 354;
    public static final int CHAMPIONS_LEAGUE = 362;
//    public static final int PRIMERA_DIVISION = 358;
//    public static final int BUNDESLIGA = 351;
    public static final int BUNDESLIGA_1 = 394;
    public static final int BUNDESLIGA_2 = 395;
    public static final int LIGUE_1 = 396;
    public static final int LIGUE_2 = 397;
    public static final int PREMIER_LEAGUE = 398;
    public static final int PRIMERA_DIVISION = 399;
    public static final int SEGUNDA_DIVISION = 400;
    public static final int SERIA_A = 401;
    public static final int PRIMEIRA_LIGA = 402;
    public static final int BUNDESLIGA_3 = 403;
    public static final int EREDIVISIE = 404;

    public static String getLeague(Context context, int league_num)
    {
        switch (league_num)
        {
            case CHAMPIONS_LEAGUE : return context.getString(R.string.league_champions_league);

            case BUNDESLIGA_1 : return context.getString(R.string.league_bundesliga_1);
            case BUNDESLIGA_2 : return context.getString(R.string.league_bundesliga_2);
            case LIGUE_1 : return context.getString(R.string.league_ligue_1);
            case LIGUE_2 : return context.getString(R.string.league_ligue_2);
            case PREMIER_LEAGUE : return context.getString(R.string.league_premier_league);
            case PRIMERA_DIVISION : return context.getString(R.string.league_primera_division);
            case SEGUNDA_DIVISION : return context.getString(R.string.league_segunda_division);
            case SERIA_A : return context.getString(R.string.league_serie_a);
            case PRIMEIRA_LIGA : return context.getString(R.string.league_primeira_liga);
            case BUNDESLIGA_3 : return context.getString(R.string.league_bundesliga_3);
            case EREDIVISIE : return context.getString(R.string.league_eredivisie);
            default: return context.getString(R.string.league_not_known);
        }
    }
    public static String getMatchDay(Context context, int match_day,int league_num)
    {
        if(league_num == CHAMPIONS_LEAGUE)
        {
            if (match_day <= 6)
            {
                return context.getString(R.string.match_day_6);
            }
            else if(match_day == 7 || match_day == 8)
            {
                return context.getString(R.string.match_day_knockout_round);
            }
            else if(match_day == 9 || match_day == 10)
            {
                return context.getString(R.string.match_day_quarterfinal);
            }
            else if(match_day == 11 || match_day == 12)
            {
                return context.getString(R.string.match_day_semifinal);
            }
            else
            {
                return context.getString(R.string.match_day_final);
            }
        }
        else
        {
            return context.getString(R.string.match_day) + String.valueOf(match_day);
        }
    }

    public static String getScores(int home_goals,int awaygoals)
    {
        if(home_goals < 0 || awaygoals < 0)
        {
            return " - ";
        }
        else
        {
            return String.valueOf(home_goals) + " - " + String.valueOf(awaygoals);
        }
    }

    public static int getTeamCrestByTeamName (String teamname)
    {
        if (teamname==null){return R.drawable.no_icon;}
        switch (teamname)
        {
            case "Arsenal London FC" : return R.drawable.arsenal;
            case "Manchester United FC" : return R.drawable.manchester_united;
            case "Swansea City" : return R.drawable.swansea_city_afc;
            case "Leicester City" : return R.drawable.leicester_city_fc_hd_logo;
            case "Everton FC" : return R.drawable.everton_fc_logo1;
            case "West Ham United FC" : return R.drawable.west_ham;
            case "Tottenham Hotspur FC" : return R.drawable.tottenham_hotspur;
            case "West Bromwich Albion" : return R.drawable.west_bromwich_albion_hd_logo;
            case "Sunderland AFC" : return R.drawable.sunderland;
            case "Stoke City FC" : return R.drawable.stoke_city;
            default: return R.drawable.no_icon;
        }
    }
}
