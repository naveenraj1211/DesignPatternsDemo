package org.example.singleton.configurationmanager;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    private static FileBasedConfigurationManagerImpl instance = null;

    private FileBasedConfigurationManagerImpl() {
        //private constructor
    }

    public static FileBasedConfigurationManagerImpl getInstance() {
        if (instance == null) {
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (instance == null) {
                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        if (instance != null)
            instance = null;
    }


    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = properties.getProperty(key);
        if (value != null)
            return convert(value, type);
        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        properties.setProperty(key,String.valueOf(value));
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }
}
