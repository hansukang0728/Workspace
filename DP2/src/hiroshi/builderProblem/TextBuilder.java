package hiroshi.builderProblem;
public class TextBuilder extends Builder {
    private String buffer = "";                           // �� �ʵ忡 ������ �����Ѵ�
    public void makeTitle(String title) {                   // �Ϲ� �ؽ�Ʈ�� Ÿ��Ʋ
        buffer += "==============================\n";      // ��ļ�
        buffer += "��" + title + "��\n";                   // �������� Ÿ��Ʋ
        buffer += "\n";                                 // ����
    }
    public void makeString(String str) {                    // �Ϲ� �ؽ�Ʈ������ ���ڿ�
        buffer += ' ' + str + "\n";                       // ����� ���ڿ�
        buffer += "\n";                                  // ����
    }
    public void makeItems(String[] items) {                 // �Ϲ� �ؽ�Ʈ������ �����׸�
        for (int i = 0; i < items.length; i++) {
            buffer += " ��" + items[i] + "\n";             // ������ �׸�
        }
        buffer += "\n";                                  // ����
    }
    public void close() {                                  // ������ �ϼ�
        buffer += "==============================\n";           // ��ļ�
    }
    public String getResult() {                             // �ϼ��� ����
        return buffer;
    }
}
