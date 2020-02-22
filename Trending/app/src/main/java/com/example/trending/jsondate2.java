package com.example.trending;

public class jsondate2 {
    /**
     * username : tiepvupsu
     * name : tiepvupsu
     * url : https://github.com/tiepvupsu
     * avatar : https://avatars2.githubusercontent.com/u/2201237
     * repo : {"name":"tiepvupsu.github.io","description":"My Machine Learning blog","url":"https://github.com/tiepvupsu/tiepvupsu.github.io"}
     */

    private String username;
    private String name;
    private String url;
    private String avatar;
    private RepoBean repo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public RepoBean getRepo() {
        return repo;
    }

    public void setRepo(RepoBean repo) {
        this.repo = repo;
    }

    public static class RepoBean {
        /**
         * name : tiepvupsu.github.io
         * description : My Machine Learning blog
         * url : https://github.com/tiepvupsu/tiepvupsu.github.io
         */

        private String name;
        private String description;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
