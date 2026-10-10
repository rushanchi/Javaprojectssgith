public class WorkStr {
    public static void main() {
        String[] roles = {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textlines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textlines));

    }

    public static String printTextPerRole(String[] roles, String[] textlines) {
        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < roles.length; r++) {
            String prefix = roles[r] + ":";
            sb.append(roles[r]).append(":\n");

            for (int i = 0; i < textlines.length; i++) {
                if (textlines[i].startsWith(prefix)) {
                    sb.append(i + 1).append(") ");
                    String text = textlines[i].substring(prefix.length());
                    if (text.startsWith(" ")) {
                        text = text.substring(1);
                    }
                    sb.append(text).append('\n');
                }
            }

            if (r < roles.length - 1) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
