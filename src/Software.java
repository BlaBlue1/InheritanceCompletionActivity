public class Software {
        private String programmer, platform, os;

        public Software() {
            this.programmer = "";
            this.platform = "";
            this.os = "";

        }
        public Software(String programmer, String platform, String os) {
            this.programmer = programmer;
            this.platform = platform;
            this.os = os;
        }
        public String getProgrammer(){
            return programmer;
        }
        public String getPlatform(){
            return platform;
        }
        public String getOs() {
            return os;
        }




}
