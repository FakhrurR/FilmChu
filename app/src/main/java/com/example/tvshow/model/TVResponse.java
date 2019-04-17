package com.example.tvshow.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVResponse {


    /**
     * page : 1
     * total_results : 385
     * total_pages : 20
     * results : [{"original_name":"Game of Thrones","genre_ids":[18,10759,10765],"name":"Game of Thrones","popularity":740.215,"origin_country":["US"],"vote_count":5539,"first_air_date":"2011-04-17","backdrop_path":"/qsD5OHqW7DSnaQ2afwz8Ptht1Xb.jpg","original_language":"en","id":1399,"vote_average":8.2,"overview":"Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.","poster_path":"/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg"},{"original_name":"ワンパンマン","genre_ids":[16,35,10759],"name":"One-Punch Man","popularity":408.204,"origin_country":["JP"],"vote_count":303,"first_air_date":"2015-10-04","backdrop_path":"/s0w8JbuNNxL1YgaHeDWih12C3jG.jpg","original_language":"ja","id":63926,"vote_average":8.2,"overview":"Saitama is a hero who only became a hero for fun. After three years of \u201cspecial\u201d training, though, he\u2019s become so strong that he\u2019s practically invincible. In fact, he\u2019s too strong\u2014even his mightiest opponents are taken out with a single punch, and it turns out that being devastatingly powerful is actually kind of a bore. With his passion for being a hero lost along with his hair, yet still faced with new enemies every day, how much longer can he keep it going?","poster_path":"/iE3s0lG5QVdEHOEZnoAxjmMtvne.jpg"},{"original_name":"フェアリーテイル","genre_ids":[16,35,10759,10765],"name":"Fairy Tail","popularity":290.37,"origin_country":["JP"],"vote_count":141,"first_air_date":"2009-10-12","backdrop_path":"/m2lugAG39sO0yCcuxEAu4fY5u1o.jpg","original_language":"ja","id":46261,"vote_average":6.6,"overview":"Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.","poster_path":"/58GKcwFV3lpVOGzybeMrrNOjHpz.jpg"},{"original_name":"Arrow","genre_ids":[80,18,9648,10759],"name":"Arrow","popularity":289.642,"origin_country":["US"],"vote_count":2382,"first_air_date":"2012-10-10","backdrop_path":"/dKxkwAJfGuznW8Hu0mhaDJtna0n.jpg","original_language":"en","id":1412,"vote_average":5.8,"overview":"Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.","poster_path":"/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg"},{"original_name":"The Flash","genre_ids":[18,10765],"name":"The Flash","popularity":285.58,"origin_country":["US"],"vote_count":2594,"first_air_date":"2014-10-07","backdrop_path":"/jC1KqsFx8ZyqJyQa2Ohi7xgL7XC.jpg","original_language":"en","id":60735,"vote_average":6.7,"overview":"After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.","poster_path":"/fki3kBlwJzFp8QohL43g9ReV455.jpg"},{"original_name":"Doom Patrol","genre_ids":[10759,10765],"name":"Doom Patrol","popularity":198.333,"origin_country":["US"],"vote_count":118,"first_air_date":"2019-02-15","backdrop_path":"/sAzw6I1G9JUxm86KokIDdQeWtaq.jpg","original_language":"en","id":79501,"vote_average":6,"overview":"The Doom Patrol\u2019s members each suffered horrible accidents that gave them superhuman abilities \u2014 but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence \u2014 and to protect Earth from what they find.","poster_path":"/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg"},{"original_name":"Supernatural","genre_ids":[18,9648,10765],"name":"Supernatural","popularity":187.784,"origin_country":["US"],"vote_count":1751,"first_air_date":"2005-09-13","backdrop_path":"/o9OKe3M06QMLOzTl3l6GStYtnE9.jpg","original_language":"en","id":1622,"vote_average":7.2,"overview":"When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ","poster_path":"/3iFm6Kz7iYoFaEcj4fLyZHAmTQA.jpg"},{"original_name":"Grey's Anatomy","genre_ids":[18],"name":"Grey's Anatomy","popularity":178.174,"origin_country":["US"],"vote_count":912,"first_air_date":"2005-03-27","backdrop_path":"/y6JABtgWMVYPx84Rvy7tROU5aNH.jpg","original_language":"en","id":1416,"vote_average":6.2,"overview":"Follows the personal and professional lives of a group of doctors at Seattle\u2019s Grey Sloan Memorial Hospital.","poster_path":"/eqgIOObafPJitt8JNh1LuO2fvqu.jpg"},{"original_name":"The Blacklist","genre_ids":[80,18,9648],"name":"The Blacklist","popularity":171.963,"origin_country":["US"],"vote_count":947,"first_air_date":"2013-09-23","backdrop_path":"/fHwiAqIKragaCbNJo9Qs4lrccIN.jpg","original_language":"en","id":46952,"vote_average":7,"overview":"Raymond \"Red\" Reddington, one of the FBI's most wanted fugitives, surrenders in person at FBI Headquarters in Washington, D.C. He claims that he and the FBI have the same interests: bringing down dangerous criminals and terrorists. In the last two decades, he's made a list of criminals and terrorists that matter the most but the FBI cannot find because it does not know they exist. Reddington calls this \"The Blacklist\". Reddington will co-operate, but insists that he will speak only to Elizabeth Keen, a rookie FBI profiler.","poster_path":"/bgbQCW4fE9b6wSOSC6Fb4FfVzsW.jpg"},{"original_name":"ワンピース","genre_ids":[16,35,10759],"name":"One Piece","popularity":170.303,"origin_country":["JP"],"vote_count":210,"first_air_date":"1999-10-20","backdrop_path":"/xgs7zAF5VSGAK0QstH1Q0ivybXz.jpg","original_language":"ja","id":37854,"vote_average":7.7,"overview":"Years ago, the fearsome pirate king Gol D. Roger was executed, leaving a huge pile of treasure and the famous \"One Piece\" behind. Whoever claims the \"One Piece\" will be named the new pirate king. Monkey D. Luffy, a boy who consumed one of the \"Devil's Fruits\", has it in his head that he'll follow in the footsteps of his idol, the pirate Shanks, and find the One Piece. It helps, of course, that his body has the properties of rubber and he's surrounded by a bevy of skilled fighters and thieves to help him along the way. Monkey D. Luffy brings a bunch of his crew followed by, Roronoa Zoro, Nami, Usopp, Sanji, Tony-Tony Chopper, Nico Robin, Franky, and Brook. They will do anything to get the One Piece and become King of the Pirates!","poster_path":"/gJI77i79KnRuc9mGPKADPZWAE8O.jpg"},{"original_name":"Riverdale","genre_ids":[18,9648],"name":"Riverdale","popularity":160.015,"origin_country":["US"],"vote_count":500,"first_air_date":"2017-01-26","backdrop_path":"/2IUpoKSP64r6rp2vBo0Fdk8a1UU.jpg","original_language":"en","id":69050,"vote_average":6.9,"overview":"Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale\u2019s wholesome facade.","poster_path":"/gskv297rlbyzLaTU1XZf8UBbxp0.jpg"},{"original_name":"Gotham","genre_ids":[80,18,14],"name":"Gotham","popularity":134.085,"origin_country":["US"],"vote_count":1060,"first_air_date":"2014-09-22","backdrop_path":"/mKBP1OCgCG0jw8DwVYlnYqVILtc.jpg","original_language":"en","id":60708,"vote_average":6.8,"overview":"Before there was Batman, there was GOTHAM. \n\nEveryone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them \u2013 the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker? ","poster_path":"/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg"},{"original_name":"NCIS","genre_ids":[80,18,10759],"name":"NCIS","popularity":124.412,"origin_country":["US"],"vote_count":742,"first_air_date":"2003-09-23","backdrop_path":"/nymeWHYQ1JaWP2wyNW5a5WHiDCd.jpg","original_language":"en","id":4614,"vote_average":6.7,"overview":"From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.","poster_path":"/eoj15m14Zpf2bUWXqNIs7itZK9w.jpg"},{"original_name":"Gogglebox","genre_ids":[10751],"name":"Gogglebox","popularity":117.441,"origin_country":["GB"],"vote_count":9,"first_air_date":"2013-03-07","backdrop_path":"/cPR0NDpg4ElH5HizePB7liHyEmS.jpg","original_language":"en","id":55808,"vote_average":6.3,"overview":"Gogglebox is an entertaining television review programme in which some of Britain's most opinionated and avid telly viewers comment freely on the best and worst television shows of the past week, from the comfort of their sofas.","poster_path":"/gfrCcQWGkvopGoqBsnSqUZUpQ7Z.jpg"},{"original_name":"Supergirl","genre_ids":[28,12,18,878],"name":"Supergirl","popularity":112.053,"origin_country":["US"],"vote_count":912,"first_air_date":"2015-10-26","backdrop_path":"/2qou2R47XZ1N6SlqGZcoCHDyEhN.jpg","original_language":"en","id":62688,"vote_average":5.7,"overview":"Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.","poster_path":"/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg"},{"original_name":"ブラッククローバー","genre_ids":[16,35,10759],"name":"Black Clover","popularity":109.689,"origin_country":["JP"],"vote_count":58,"first_air_date":"2017-10-03","backdrop_path":"/jHH4jmWWmYWpoxpGwMYM5RqJnvo.jpg","original_language":"ja","id":73223,"vote_average":5.5,"overview":"Asta and Yuno were abandoned together at the same church, and have been inseparable since. As children, they promised that they would compete against each other to see who would become the next Emperor Magus. However, as they grew up, some differences between them became plain. Yuno was a genius with magic, with amazing power and control, while Asta could not use magic at all, and tried to make up for his lack by training physically. When they received their Grimoires at age 15, Yuno got a spectacular book with a four-leaf clover (most people receive a three-leaf-clover), while Asta received nothing at all. However, when Yuno was threatened, the truth about Asta's power was revealed, he received a five-leaf clover Grimoire, a \"black clover\"! Now the two friends are heading out in the world, both seeking the same goal!","poster_path":"/kaMisKeOoTBPxPkbC3OW7Wgt6ON.jpg"},{"original_name":"Brooklyn Nine-Nine","genre_ids":[35,80],"name":"Brooklyn Nine-Nine","popularity":106.601,"origin_country":["US"],"vote_count":612,"first_air_date":"2013-09-17","backdrop_path":"/ncC9ZgZuKOdaVm7yXinUn26Qyok.jpg","original_language":"en","id":48891,"vote_average":7.5,"overview":"A single-camera ensemble comedy following the lives of an eclectic group of detectives in a New York precinct, including one slacker who is forced to shape up when he gets a new boss.","poster_path":"/A3SymGlOHefSKbz1bCOz56moupS.jpg"},{"original_name":"American Gods","genre_ids":[18,9648,10765],"name":"American Gods","popularity":104.6,"origin_country":["US"],"vote_count":530,"first_air_date":"2017-04-30","backdrop_path":"/7dnjFPoa22Yl3RKctp8kgUxiUg9.jpg","original_language":"en","id":46639,"vote_average":6.8,"overview":"An ex-con becomes the traveling partner of a conman who turns out to be one of the older gods trying to recruit troops to battle the upstart deities. Based on Neil Gaiman's fantasy novel.","poster_path":"/btwTe5cQbGWGOErBiRqnjNP9cJl.jpg"},{"original_name":"DC's Legends of Tomorrow","genre_ids":[18,10759,10765],"name":"DC's Legends of Tomorrow","popularity":96.865,"origin_country":["US"],"vote_count":687,"first_air_date":"2016-01-21","backdrop_path":"/sTPdVITBuohDBNBA6M6Pk5KqQSl.jpg","original_language":"en","id":62643,"vote_average":6.1,"overview":"When heroes alone are not enough ... the world needs legends. Having seen the future, one he will desperately try to prevent from happening, time-traveling rogue Rip Hunter is tasked with assembling a disparate group of both heroes and villains to confront an unstoppable threat \u2014 one in which not only is the planet at stake, but all of time itself. Can this ragtag team defeat an immortal threat unlike anything they have ever known?","poster_path":"/icv3e1l8od9VjQD4NlvpBySyY09.jpg"},{"original_name":"Star Trek: Discovery","genre_ids":[10765],"name":"Star Trek: Discovery","popularity":93.353,"origin_country":["US"],"vote_count":545,"first_air_date":"2017-09-24","backdrop_path":"/rhE2h8WYJOPuBlMl20MQRnJw3aq.jpg","original_language":"en","id":67198,"vote_average":6.8,"overview":"Follow the voyages of Starfleet on their missions to discover new worlds and new life forms, and one Starfleet officer who must learn that to truly understand all things alien, you must first understand yourself.","poster_path":"/aJTSeqG43514TewIuS9hiHvbero.jpg"}]
     */

    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<ResultsTVShow> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<ResultsTVShow> getResults() {
        return results;
    }

    public void setResults(List<ResultsTVShow> results) {
        this.results = results;
    }

    public static class ResultsTVShow implements Parcelable {
        /**
         * original_name : Game of Thrones
         * genre_ids : [18,10759,10765]
         * name : Game of Thrones
         * popularity : 740.215
         * origin_country : ["US"]
         * vote_count : 5539
         * first_air_date : 2011-04-17
         * backdrop_path : /qsD5OHqW7DSnaQ2afwz8Ptht1Xb.jpg
         * original_language : en
         * id : 1399
         * vote_average : 8.2
         * overview : Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.
         * poster_path : /u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg
         */

        @SerializedName("original_name")
        private String originalName;
        @SerializedName("name")
        private String name;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("first_air_date")
        private String firstAirDate;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("id")
        private int id;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("overview")
        private String overview;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("genre_ids")
        private List<Integer> genreIds;
        @SerializedName("origin_country")
        private List<String> originCountry;

        protected ResultsTVShow(Parcel in) {
            originalName = in.readString();
            name = in.readString();
            popularity = in.readDouble();
            voteCount = in.readInt();
            firstAirDate = in.readString();
            backdropPath = in.readString();
            originalLanguage = in.readString();
            id = in.readInt();
            voteAverage = in.readDouble();
            overview = in.readString();
            posterPath = in.readString();
            originCountry = in.createStringArrayList();
        }

        public static final Creator<ResultsTVShow> CREATOR = new Creator<ResultsTVShow>() {
            @Override
            public ResultsTVShow createFromParcel(Parcel in) {
                return new ResultsTVShow(in);
            }

            @Override
            public ResultsTVShow[] newArray(int size) {
                return new ResultsTVShow[size];
            }
        };

        public String getOriginalName() {
            return originalName;
        }

        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public int getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }

        public String getFirstAirDate() {
            return firstAirDate;
        }

        public void setFirstAirDate(String firstAirDate) {
            this.firstAirDate = firstAirDate;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(double voteAverage) {
            this.voteAverage = voteAverage;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        public List<String> getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(List<String> originCountry) {
            this.originCountry = originCountry;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(originalName);
            dest.writeString(name);
            dest.writeDouble(popularity);
            dest.writeInt(voteCount);
            dest.writeString(firstAirDate);
            dest.writeString(backdropPath);
            dest.writeString(originalLanguage);
            dest.writeInt(id);
            dest.writeDouble(voteAverage);
            dest.writeString(overview);
            dest.writeString(posterPath);
            dest.writeStringList(originCountry);
        }
    }
}
