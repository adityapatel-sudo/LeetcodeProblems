package com.company.SchoolProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Container;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingWorker;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;

//
// Decompiled by Procyon v0.5.36
//

public class SortDetective
{
    private static JLabel display;
    private static JButton gobutton;
    private static JComboBox<String> sortlist;
    private static JComboBox<String> arrtypelist;
    private static JTextField lengthfield;
    private static String[] sorts;
    private static String[] arrtypes;
    private static boolean running;
    private static SwingWorker worker;
    private static long timer;

    public static void createAndShowGUI() {
        final JFrame frame = new JFrame("Sort Detective");
        frame.setDefaultCloseOperation(3);
        final JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        final GridBagLayout layout = new GridBagLayout();
        final GridBagConstraints constraints = new GridBagConstraints();
        final GridBagConstraints constraints2 = new GridBagConstraints();
        final JPanel comp = new JPanel(layout);
        contentPane.add(comp, "Center");
        frame.setContentPane(contentPane);
        constraints.fill = 2;
        constraints.gridwidth = -1;
        comp.add(new JLabel("Sorting algorithm: "), constraints);
        SortDetective.sortlist = new JComboBox<String>(SortDetective.sorts);
        constraints2.fill = 2;
        constraints2.gridwidth = 0;
        comp.add(SortDetective.sortlist, constraints2);
        comp.add(new JLabel("Number of elements: "), constraints);
        comp.add(SortDetective.lengthfield = new JTextField(""), constraints2);
        comp.add(new JLabel("Order of elements: "), constraints);
        comp.add(SortDetective.arrtypelist = new JComboBox<String>(SortDetective.arrtypes), constraints2);
        constraints2.fill = 1;
        SortDetective.display = new JLabel("Initializing...", 0);
        constraints2.weighty = 1.0;
        constraints2.weightx = 1.0;
        SortDetective.display.setFont(new Font(SortDetective.display.getFont().getName(), 0, 24));
        comp.add(SortDetective.display, constraints2);
        SortDetective.gobutton = new JButton("Loading...");
        constraints2.fill = 0;
        SortDetective.gobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                if (!SortDetective.running) {
                    SortDetective.running = true;
                    SortDetective.gobutton.setText("Cancel");
                    SortDetective.sortlist.setEnabled(false);
                    SortDetective.arrtypelist.setEnabled(false);
                    SortDetective.lengthfield.setEnabled(false);
                    SortDetective.worker.execute();
                }
                else {
                    SortDetective.display.setText("Cancelling...");
                    SortDetective.gobutton.setEnabled(false);
                    SortDetective.worker.cancel(true);
                    SortDetective.gobutton.setText("Cancelling...");
                    SortDetective.running = false;
                }
            }
        });
        SortDetective.gobutton.setEnabled(false);
        comp.add(SortDetective.gobutton, constraints2);
        SortDetective.worker = new SortHandler();
        frame.pack();
        frame.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SortDetective.initialize();
            }
        });
    }

    public static void initialize() {
        System.out.println("Initializing...");
        for (int i = 1; i <= 200000; ++i) {
            try {
                for (int j = 0; j < 6; ++j) {
                    sort(genArray(10, 0), j);
                }
            }
            catch (InterruptedException ex) {
                System.out.println("Warning: initialization interrupted.");
            }
        }
        System.out.println("Initialization complete.");
        SortDetective.display.setText("Ready.");
        SortDetective.gobutton.setEnabled(true);
        SortDetective.gobutton.setText("Sort!");
    }

    public static void main(final String[] array) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SortDetective.createAndShowGUI();
            }
        });
    }

    public static int[] genArray(final int n, final int n2) throws InterruptedException {
        if (n2 == 0) {
            final int[] array = new int[n];
            final ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < array.length; ++i) {
                list.add(i + 1);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            Collections.shuffle(list);
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            for (int j = 0; j < array.length; ++j) {
                array[j] = list.get(j);
            }
            return array;
        }
        else {
            if (n2 == 1) {
                final int[] array2 = new int[n];
                for (int k = 0; k < n; ++k) {
                    array2[k] = k + 1;
                }
                return array2;
            }
            if (n2 == 2) {
                final int[] array3 = new int[n];
                for (int l = 0; l < n; ++l) {
                    array3[l] = n - l;
                }
                return array3;
            }
            System.out.println("ERROR: INVALID ARRAY TYPE");
            return new int[0];
        }
    }

    public static void sort(final int[] array, final int i) throws InterruptedException {
        switch (i) {
            case 0: {
                // this is for algorithm 0
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                if (array.length == 1) {
                    return;
                }
                final int[] copyOfRange = Arrays.copyOfRange(array, 0, array.length / 2);
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                final int[] copyOfRange2 = Arrays.copyOfRange(array, array.length / 2, array.length);
                sort(copyOfRange, i);
                sort(copyOfRange2, i);
                int n = 0;
                int n2 = 0;
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                for (int j = 0; j < array.length; ++j) {
                    if (n2 == copyOfRange2.length || (n < copyOfRange.length && copyOfRange[n] <= copyOfRange2[n2])) {
                        array[j] = copyOfRange[n];
                        ++n;
                    }
                    else {
                        array[j] = copyOfRange2[n2];
                        ++n2;
                    }
                }
                break;
            }
            case 1: {
                for (int k = 0; k < array.length; ++k) {
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    int n3 = k;
                    for (int l = k + 1; l < array.length; ++l) {
                        if (array[l] < array[n3]) {
                            n3 = l;
                        }
                    }
                    swap(array, n3, k);
                }
                break;
            }
            case 2: {
                int n4 = 1;
                while (n4 != 0) {
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    n4 = 0;
                    for (int n5 = 0; n5 < array.length - 1; ++n5) {
                        if (array[n5] > array[n5 + 1]) {
                            swap(array, n5, n5 + 1);
                            n4 = 1;
                        }
                    }
                }
                break;
            }
            case 3: {
                helper1(array, 0, array.length);
                break;
            }
            case 4: {
                for (final int n7 : helper2(array.length)) {
                    for (int n8 = 0; n8 < n7; ++n8) {
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                        for (int n9 = n8 + n7; n9 < array.length; n9 += n7) {
                            for (int n10 = n9; n10 >= n7 && array[n10] < array[n10 - n7]; n10 -= n7) {
                                swap(array, n10, n10 - n7);
                            }
                        }
                    }
                }
                break;
            }
            case 5: {
                for (int n11 = 1; n11 < array.length; ++n11) {
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    for (int n12 = n11; n12 > 0 && array[n12] < array[n12 - 1]; --n12) {
                        swap(array, n12, n12 - 1);
                    }
                }
                break;
            }
            case 6: {
                while (!isSorted(array)) {
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    final ArrayList<Integer> list = new ArrayList<Integer>();
                    for (int n13 = 0; n13 < array.length; ++n13) {
                        list.add(array[n13]);
                    }
                    Collections.shuffle(list);
                    for (int index = 0; index < array.length; ++index) {
                        array[index] = list.get(index);
                    }
                }
                break;
            }
            default: {
                System.out.println("ERROR: INVALID SORT TYPE: " + i);
                break;
            }
        }
        SortDetective.gobutton.setEnabled(true);
    }

    public static void helper1(final int[] array, final int n, final int n2) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (n2 - n <= 1) {
            return;
        }
        int n3 = n + 1;
        for (int i = n + 1; i < n2; ++i) {
            if (array[i] < array[n]) {
                swap(array, i, n3);
                ++n3;
            }
        }
        swap(array, n3 - 1, n);
        helper1(array, n, n3 - 1);
        helper1(array, n3, n2);
    }

    public static int[] helper2(final int n) {
        int n2 = 1;
        for (int n3 = 1; n3 * n3 * 4 + n3 * 3 + 1 < n; n3 *= 2, ++n2) {}
        int n4 = 1;
        final int[] array = new int[n2];
        array[n2 - 1] = 1;
        for (int i = 1; i < n2; ++i) {
            array[n2 - i - 1] = n4 * n4 * 4 + n4 * 3 + 1;
            n4 *= 2;
        }
        return array;
    }

    public static void swap(final int[] array, final int n, final int n2) {
        final int n3 = array[n];
        array[n] = array[n2];
        array[n2] = n3;
    }

    public static void startTime() {
        SortDetective.timer = System.nanoTime();
    }

    public static void endTime() {
        SortDetective.display.setText(System.nanoTime() - SortDetective.timer + " ns");
    }

    public static boolean isSorted(final int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static {
        SortDetective.sorts = new String[] { "0", "1", "2", "3", "4", "5", "6" };
        SortDetective.arrtypes = new String[] { "Random", "Ascending", "Descending" };
        SortDetective.running = false;
        SortDetective.timer = 0L;
    }

    private static class SortHandler extends SwingWorker<Integer, Void>
    {
        public Integer doInBackground() {
            try {
                final int int1 = Integer.parseInt(SortDetective.lengthfield.getText());
                if (int1 <= 0 || int1 > 9999999) {
                    throw new NumberFormatException();
                }
                SortDetective.display.setText("Generating array...");
                final int[] genArray = SortDetective.genArray(int1, SortDetective.arrtypelist.getSelectedIndex());
                SortDetective.display.setText("Sorting...");
                SortDetective.startTime();
                SortDetective.sort(genArray, SortDetective.sortlist.getSelectedIndex());
                SortDetective.endTime();
                SortDetective.gobutton.setText("Sort!");
            }
            catch (NumberFormatException ex) {
                SortDetective.display.setText("Invalid length.");
                SortDetective.gobutton.setText("Sort!");
            }
            catch (OutOfMemoryError outOfMemoryError) {
                SortDetective.display.setText("Memory overflow -- input too large.");
                SortDetective.gobutton.setText("Sort!");
            }
            catch (InterruptedException ex2) {
                SortDetective.display.setText("Cancelled.");
                SortDetective.gobutton.setText("Sort!");
            }
            SortDetective.gobutton.setEnabled(true);
            SortDetective.sortlist.setEnabled(true);
            SortDetective.arrtypelist.setEnabled(true);
            SortDetective.lengthfield.setEnabled(true);
            SortDetective.running = false;
            SortDetective.worker = new SortHandler();
            return 0;
        }
    }
}