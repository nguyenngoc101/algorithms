package patterns;


interface InputStream {
    int read(byte[] buffer, int offset, int length);

    class Smart {
        private InputStream origin;

        public Smart(InputStream origin) {
            this.origin = origin;
        }

        public int read() {
            final byte[] buffer = new byte[1];
            final int read = this.origin.read(buffer, 0, 1);
            final int result;
            if (read < 1) {
                result = -1;
            } else {
                result = buffer[0];
            }
            return result;
        }
    }

    default public void main(String[] args) {
        final InputStream input = new FileInputStream("/tmp/a.txt");
        final int b = new InputStream.Smart(input).read();
    }
}

