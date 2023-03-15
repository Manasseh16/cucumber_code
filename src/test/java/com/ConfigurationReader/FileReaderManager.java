package com.ConfigurationReader;

import java.io.IOException;

public class FileReaderManager {

public FileReaderManager() {

}
public FileReaderManager GetInstanceFR() {
	FileReaderManager fr = new FileReaderManager();
	return fr;

}
public configurationReader GetInstanceCR() throws IOException  {
configurationReader cr = new configurationReader();
return cr;
}
}